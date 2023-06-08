package com.example.jabeklah.repository;

import com.example.jabeklah.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepo extends JpaRepository<Compte, Long> {
    Compte findByRib(String rib);
}