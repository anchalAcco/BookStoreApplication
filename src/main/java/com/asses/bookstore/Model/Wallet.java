package com.asses.bookstore.Model;

//import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
//@Component
@Entity
public class Wallet {


    @Id
    private Long id;

    private int balance;

    public Wallet() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Wallet(Long id,  int balance) {
        this.id = id;
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
