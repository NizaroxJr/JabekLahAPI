package com.example.jabeklah.repository;

import com.example.jabeklah.models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepo extends JpaRepository<Facture,Long> {
    Facture findByCreancier(String creancier);
    Facture findByRef(String ref);
}
