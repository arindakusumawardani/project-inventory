package com.enigma.arinda.service.impl;


import com.enigma.arinda.entities.Unit;
import com.enigma.arinda.repository.UnitRepository;
import com.enigma.arinda.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UnitServiceImpl extends CommonServiceImpl<Unit, Integer> implements UnitService {

    @Autowired
    public UnitServiceImpl(UnitRepository repository) {
        super(repository);
    }
}

