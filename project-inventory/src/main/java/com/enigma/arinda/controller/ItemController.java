package com.enigma.arinda.controller;

import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.Unit;
import com.enigma.arinda.model.ResponseMessage;
import com.enigma.arinda.model.items.ItemRequest;
import com.enigma.arinda.model.items.ItemResponse;
import com.enigma.arinda.service.ItemService;
import com.enigma.arinda.service.UnitService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

@RequestMapping("/items")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private UnitService unitService;

    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    public ResponseMessage<ItemResponse> add(@RequestBody @Valid ItemRequest model) {
        Item entity = modelMapper.map(model, Item.class);
        Unit unit = unitService.findById(model.getUnitId());
        entity.setUnit(unit);
        entity = itemService.save(entity);

        ItemResponse data = modelMapper.map(entity, ItemResponse.class);
        return ResponseMessage.success(data);
    }

    @PutMapping("/{id")
    public ResponseMessage<ItemResponse> edit(
            @PathVariable Integer id, @RequestBody ItemRequest model){
        Item entity = itemService.findById(id);
        if(entity == null) {
            throw new EntityNotFoundException();
        }

        Unit unit = unitService.findById(model.getUnitId());
        entity.setUnit(unit);
        modelMapper.map(model,entity);

        entity = itemService.save(entity);

        ItemResponse data = modelMapper.map(entity,ItemResponse.class);
        return ResponseMessage.success(data);

    }

    @DeleteMapping("/{id}")
    public ResponseMessage<ItemResponse> removeById(@PathVariable Integer id) {
        Item entity = itemService.removeById(id);
        if (entity == null) {
            throw new EntityNotFoundException();
        }
        ItemResponse data = modelMapper.map(entity, ItemResponse.class);
        return ResponseMessage.success(data);
    }



}
