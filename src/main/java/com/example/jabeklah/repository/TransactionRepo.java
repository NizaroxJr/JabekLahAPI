package com.example.jabeklah.repository;

import com.example.jabeklah.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction,Long> {

}
