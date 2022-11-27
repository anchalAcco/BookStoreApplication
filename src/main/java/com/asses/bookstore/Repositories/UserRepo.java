package com.asses.bookstore.Repositories;

import com.asses.bookstore.Model.Books;
import com.asses.bookstore.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<Users, Long> {



}
