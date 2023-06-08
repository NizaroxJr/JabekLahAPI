
package com.example.jabeklah.repository;

import com.example.jabeklah.models.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<UserApp, Long> {
        UserApp findByEmail(String email);
        UserApp findByNumTel(String numTel);
        Boolean existsByUsername(String username);
        Boolean existsByEmail(String email);
}


