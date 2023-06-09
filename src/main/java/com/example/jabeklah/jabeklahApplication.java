package com.example.jabeklah;

import com.example.jabeklah.models.Admin;
import com.example.jabeklah.service.AdminService;
import com.example.jabeklah.service.AgentService;
import com.example.jabeklah.service.FactureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class jabeklahApplication {

    public static void main(String[] args) {
        SpringApplication.run(jabeklahApplication.class, args);
    }


}


