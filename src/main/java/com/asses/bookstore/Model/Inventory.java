package com.asses.bookstore.Model;


//import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Inventory {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long inventoryid;
    private String bookname;
    private int totalcount = 1;
    private int available = 1;

    public Inventory() {
    }

    public Inventory(String bookname) {
        this.bookname = bookname;
    }

    public Long getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(Long inventoryid) {
        this.inventoryid = inventoryid;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }

    public int getAvailable() {
        return available;
    }


    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
