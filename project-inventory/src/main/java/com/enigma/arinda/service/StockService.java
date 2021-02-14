package com.enigma.arinda.service;

import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.Stock;
import com.enigma.arinda.entities.StockSummary;

import java.util.List;

public interface StockService extends CommonService<Stock,Integer>  {

    public List<StockSummary> findAllSummaries();
    public StockSummary findSummaryByItem(Item item);
}
