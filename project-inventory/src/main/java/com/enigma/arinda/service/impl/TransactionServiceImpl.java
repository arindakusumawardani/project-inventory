package com.enigma.arinda.service.impl;


import com.enigma.arinda.entities.Transaction;
import com.enigma.arinda.repository.TransactionRepository;
import com.enigma.arinda.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl extends CommonServiceImpl<Transaction, Integer> implements TransactionService {
    @Autowired
    public TransactionServiceImpl(TransactionRepository repository) {
        super(repository);
    }
}

