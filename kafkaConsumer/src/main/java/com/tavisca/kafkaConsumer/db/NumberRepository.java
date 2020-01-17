package com.tavisca.kafkaConsumer.db;

import com.tavisca.kafkaConsumer.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NumberRepository extends JpaRepository<Number,Integer> {
}
