package com.enigma.arinda.service.impl;


import com.enigma.arinda.entities.User;
import com.enigma.arinda.repository.UserRepository;
import com.enigma.arinda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends CommonServiceImpl<User, Integer> implements UserService {

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

}

