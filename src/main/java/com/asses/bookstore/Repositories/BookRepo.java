package com.asses.bookstore.Repositories;

import com.asses.bookstore.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookRepo extends JpaRepository<Books, Long> {


}
