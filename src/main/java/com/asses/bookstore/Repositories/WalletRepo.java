package com.asses.bookstore.Repositories;

import com.asses.bookstore.Model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepo extends JpaRepository<Wallet,Long> {

}
