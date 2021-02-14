package com.enigma.arinda.controller;


import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.Stock;
import com.enigma.arinda.entities.StockSummary;
import com.enigma.arinda.model.PagedList;
import com.enigma.arinda.model.ResponseMessage;
import com.enigma.arinda.model.stocks.StockElement;
import com.enigma.arinda.model.stocks.StockRequest;
import com.enigma.arinda.model.stocks.StockResponse;
import com.enigma.arinda.model.stocks.StockSearch;
import com.enigma.arinda.service.ItemService;
import com.enigma.arinda.service.StockService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/stocks")
@RestController
public class StockController {

    @Autowired
    private StockService service;

    @Autowired
    private ItemService itemService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseMessage<StockResponse> add(@Valid @RequestBody StockRequest request) {

        Stock entity = modelMapper.map(request, Stock.class);

        Item item = itemService.findById(request.getItemId());

        entity.setItem(item);
        entity.setTotalPrice(item.getPrice() * entity.getQuantity());

        entity = service.save(entity);


        StockResponse data = modelMapper.map(entity, StockResponse.class);

        return ResponseMessage.success(data);
    }

    @PutMapping("/{id}")
    public ResponseMessage<StockResponse> edit(@PathVariable Integer id, @RequestBody StockRequest request) {


        Stock entity = service.findById(id);
        modelMapper.map(request, entity);

        if (entity == null) {
            throw new EntityNotFoundException();
        }

        Item item = itemService.findById(request.getItemId());
        entity.setItem(item);
        entity.setId(id);
        entity.setTotalPrice(item.getPrice() * entity.getQuantity());

        entity = service.save(entity);

        StockResponse data = modelMapper.map(entity, StockResponse.class);
        return ResponseMessage.success(data);
    }

    @DeleteMapping("/{id}")
    public ResponseMessage removeById(@PathVariable Integer id) {
        Stock entity = service.removeById(id);
        if (entity == null) {
            throw new EntityNotFoundException();
        }
        return ResponseMessage.success(entity);
    }

    @GetMapping("/{id}")
    public ResponseMessage findById(@PathVariable Integer id) {
        Stock entity = service.findById(id);
        if (entity == null) {
            throw new EntityNotFoundException();
        }
        return ResponseMessage.success(entity);
    }

    @GetMapping()
    public ResponseMessage<PagedList<StockElement>> findAll(@Valid StockSearch model) {
        Stock search = modelMapper.map(model, Stock.class);

        Page<Stock> entityPage = service.findAll(search, model.getPage(), model.getSize(), model.getSort());
        List<Stock> entities = entityPage.toList();

        List<StockElement> models = entities.stream()
                .map(e -> modelMapper.map(e, StockElement.class))
                .collect(Collectors.toList());

        PagedList<StockElement> data = new PagedList(models,
                entityPage.getNumber(),
                entityPage.getSize(),
                entityPage.getTotalElements());

        return ResponseMessage.success(data);
    }

    @GetMapping("/summaries")
    public ResponseMessage<List<StockSummary>> findAllSummaries() {
        List<StockSummary> entityPage = service.findAllSummaries();
        return ResponseMessage.success(entityPage);

    }
}
