package com.enigma.arinda.repository;


import com.enigma.arinda.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer>, StockSummaryRepository {

}
