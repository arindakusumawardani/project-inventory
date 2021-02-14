package com.enigma.arinda.service.impl;
import com.enigma.arinda.entities.Item;
import com.enigma.arinda.repository.ItemRepository;
import com.enigma.arinda.service.ItemService;
import com.enigma.arinda.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl extends CommonServiceImpl<Item, Integer> implements ItemService {

    @Autowired
    private UnitService unitService;

    @Autowired
    public ItemServiceImpl(ItemRepository repository) {
        super(repository);
    }

}
