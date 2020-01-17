package com.tavisca.kafkaConsumer.db;

import com.tavisca.kafkaConsumer.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NumberService  {

    @Autowired
    private NumberRepository repository;

    public void save(Number number){
        repository.save(number);
    }

}
