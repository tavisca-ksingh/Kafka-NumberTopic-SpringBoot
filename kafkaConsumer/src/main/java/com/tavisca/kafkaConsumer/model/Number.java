package com.tavisca.kafkaConsumer.model;


import javax.persistence.*;

@Entity
@Table(name = "numberdata")
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int number;
    public Number() {
    }

    public Number(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public Number(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
