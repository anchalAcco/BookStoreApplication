package com.asses.bookstore.Controller;
import com.asses.bookstore.Model.Books;
import com.asses.bookstore.Model.Users;
import com.asses.bookstore.Services.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


    @RestController
    @RequestMapping("/api")
    public class UserController{


    @Autowired
    private bookservice service;
    @PostMapping("/Users")
    private ResponseEntity<Users> saveuser(@RequestBody Users newuser) {
        return ResponseEntity.ok().body(this.service.createuser(newuser));
    }

    @PostMapping("/book")
    private ResponseEntity<Books> addbook(@RequestBody Books newbook){
        return ResponseEntity.ok().body(this.service.createbook(newbook));
    }

    @GetMapping("/Userslist")
    private List<Users> getallusers(){
        return this.service.getalluser();
    }

    @GetMapping("/Bookslist")
    private List<Books> getallbooks(){
        return this.service.getallbook();
    }

    @GetMapping("/Books/{bookid}")
    private Optional<Books> getbookbyid(@PathVariable Long bookid){
        return this.service.getbookbyID(bookid);
    }

    @GetMapping("/sortedbydate")
    private List<Books> getsortedbydate(){
        return this.service.getsortbydatee();
    }

    @GetMapping("/sortedbylikes")
    private List<Books> getsortedbylike(){
        return this.service.getsortbylikes();
    }

    @PutMapping("/Users/{userid}")
    private ResponseEntity<Users> updateuser(@PathVariable Long userid, @RequestBody Users user) {
        user.setUserid(userid);
        return ResponseEntity.ok().body(this.service.updateuser(user));
    }


    @PutMapping("/suspenduser/{userid}")
    private HttpStatus suspenduser(@PathVariable Long userid) {
        this.service.suspenduser(userid);
        return HttpStatus.OK;
    }

    @PutMapping("/Wallet/{userid}/{balance}")
    private HttpStatus updatebalance(@PathVariable Long userid,@PathVariable int balance) {
        this.service.addbalance(userid,balance);
        return HttpStatus.OK;
    }

}