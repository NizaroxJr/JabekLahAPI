package com.example.jabeklah.repository;

import com.example.jabeklah.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgentRepo extends JpaRepository<Agent, Long> {
    Agent findByUsername(String username);
    Agent findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}