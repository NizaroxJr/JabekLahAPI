package com.example.jabeklah.repository;


import com.example.jabeklah.models.AgentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentFileRepo extends JpaRepository<AgentFile,Long> {
    AgentFile findByName(String name);

}
