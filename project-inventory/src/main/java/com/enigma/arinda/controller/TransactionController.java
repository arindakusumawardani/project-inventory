package com.enigma.arinda.controller;


import com.enigma.arinda.entities.*;
import com.enigma.arinda.model.ResponseMessage;
import com.enigma.arinda.model.items.ItemResponse;
import com.enigma.arinda.model.transactions.TransactionRequest;
import com.enigma.arinda.model.transactions.TransactionResponse;
import com.enigma.arinda.model.users.UserModel;
import com.enigma.arinda.service.ItemService;
import com.enigma.arinda.service.StockService;
import com.enigma.arinda.service.TransactionService;
import com.enigma.arinda.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@RequestMapping("/transactions")
@RestController
public class TransactionController {

    @Autowired
    private TransactionService service;

    @Autowired
    private StockService stockService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private UserService userService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    @Transactional
    public ResponseMessage<TransactionResponse> add(@RequestBody TransactionRequest request) {
        Item item = itemService.findById(request.getItemId());
        ItemResponse itemResponse = modelMapper.map(item, ItemResponse.class);
        if (item == null) {
            throw new EntityNotFoundException();
        }

        User user = userService.findById(request.getUserId());
        UserModel userModel = modelMapper.map(user, UserModel.class);
        if (user == null) {
            throw new EntityNotFoundException();
        }

        StockSummary stockSummary = stockService.findSummaryByItem(item);
        if (stockSummary.getQuantity() < request.getQuantity()) {
            throw new EntityNotFoundException();
        }

        Stock addStock = new Stock();
        addStock.setTotalPrice(-(item.getPrice()) * request.getQuantity());
        addStock.setQuantity(-(request.getQuantity()));
        addStock.setItem(item);

        addStock = stockService.save(addStock);

        Transaction entity = modelMapper.map(request, Transaction.class);
        entity.setItem(item);
        entity.setTotalPrice(request.getQuantity() * item.getPrice());
        entity.setStock(addStock);
        entity.setUser(user);

        entity = service.save(entity);

        TransactionResponse data = modelMapper.map(entity, TransactionResponse.class);
        data.setItemResponse(itemResponse);
        data.setUserModel(userModel);

        return ResponseMessage.success(data);
    }


    @GetMapping("/{id}")
    public ResponseMessage<TransactionResponse> getById(@PathVariable Integer id) {
        Transaction entity = service.findById(id);

        if (entity == null) {
            throw new EntityNotFoundException();
        }
        ItemResponse item = modelMapper.map(entity.getItem(), ItemResponse.class);
        UserModel userModel = modelMapper.map(entity.getUser(), UserModel.class);

        TransactionResponse data = modelMapper.map(entity, TransactionResponse.class);
        data.setItemResponse(item);
        data.setUserModel(userModel);

        return ResponseMessage.success(data);
    }
}
