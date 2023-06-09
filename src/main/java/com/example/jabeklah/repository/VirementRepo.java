package com.example.jabeklah.repository;


import com.example.jabeklah.models.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirementRepo extends JpaRepository<Virement, Long> {
    Virement findByRibdest(String rib_dest);
    Virement findByRibsource(String rib_source);

}
