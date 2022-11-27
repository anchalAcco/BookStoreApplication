package com.asses.bookstore.Repositories;

import com.asses.bookstore.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,Long> {
}
