package com.enigma.arinda.service.impl;


import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.Stock;
import com.enigma.arinda.entities.StockSummary;
import com.enigma.arinda.repository.StockRepository;
import com.enigma.arinda.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StockServiceImpl extends CommonServiceImpl<Stock, Integer> implements StockService {

    @Autowired
    public StockServiceImpl(StockRepository repository) {
        super(repository);
    }

    @Override
    public List<StockSummary> findAllSummaries() {
        return ((StockRepository) repository).findAllSummaries();
    }

    @Override
    public StockSummary findSummaryByItem(Item item) {
        return ((StockRepository) repository).findSummaryByItem(item);
    }
}

