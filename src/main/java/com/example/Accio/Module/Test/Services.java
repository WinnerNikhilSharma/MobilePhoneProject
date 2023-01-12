package com.example.Accio.Module.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    Repository repository;

    public String getPhoneNumber(String number) {
        Consumer consumer = repository.findByPhoneNumber(number);
        return consumer.getConsumerName();
    }

    public void addNewUser(Consumer consumer) {
        repository.save(consumer);
    }
}
