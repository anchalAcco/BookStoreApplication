package com.asses.bookstore.Services;
import com.asses.bookstore.Model.Books;
import com.asses.bookstore.Model.Users;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public interface bookservice {

    void addbalance(Long id,int bal);
    Books createbook(Books newbook);
    Users createuser(Users newuser);
    Users updateuser(Users user);
    void suspenduser(Long userid);

    List<Users> getalluser();
    List<Books> getallbook();

    Optional<Books> getbookbyID(Long bookid);

    List<Books> getsortbydatee();

    List<Books> getsortbylikes();
}