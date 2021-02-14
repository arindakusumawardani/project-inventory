package com.enigma.arinda.repository;


import com.enigma.arinda.entities.Item;
import com.enigma.arinda.entities.StockSummary;

import java.util.List;

public interface StockSummaryRepository {
    public List<StockSummary> findAllSummaries();

    public StockSummary findSummaryByItem(Item item);
}
