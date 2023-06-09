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

    @Bean
    CommandLineRunner run(FactureService factureService, AgentService agentService, AdminService adminService) {
        return args -> {

            /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Date date = new Date();


            factureService.createFacture("unpaied", 20.0, "paiment facture electricite", date, "LYDEC", "0697663544");
            factureService.createFacture("unpaied", 47.0, "paiment facture electricite", date, "LYDEC", "0697663544");
            factureService.createFacture("unpaied", 30.0, "paiment facture eau", date, "LYDEC", "0697663544");
            factureService.createFacture("unpaied", 120.0, "paiment facture eau", date, "LYDEC", "0697663544");
            factureService.createFacture("unpaied", 03.5, "paiment facture eau", date, "AMANDISTANGER", "0697663544");
            factureService.createFacture("unpaied", 40.0, "paiment facture electricite", date, "AMANDISTANGER", "0697663544");
            factureService.createFacture("unpaied", 57.0, "paiment facture abonement IAM", date, "IAMFACTURES", "0697663544");
            factureService.createFacture("unpaied", 43.0, "paiment facture abonement IAM", date, "IAMFACTURES", "0697663544");
            factureService.createFacture("unpaied", 99.0, "paiment facture wifi", date, "IAMFACTURES", "0697663544");
            factureService.createFacture("unpaied", 99.0, "paiment facture wifi", date, "IAMFACTURES", "0697663544");
            factureService.createFacture("unpaied", 99.0, "paiment facture electricite", date, "REDAL", "0697663544");
            factureService.createFacture("unpaied", 20.0, "paiment facture abonement telephone fix", date, "IAMRECHARGE", "0697663544");
            factureService.createFacture("unpaied", 45.0, "paiment facture abonement telephone fix", date, "IAMRECHARGE", "0697663544");
            factureService.createFacture("unpaied", 25.0, "paiment facture abonement telephone fix", date, "IAMRECHARGE", "0697663544");
            factureService.createFacture("unpaied", 27.0, "paiment facture d'eau penalite ", date, "LYDEC", "0697663544");
            factureService.createFacture("unpaied", 200.0, "paiment facture d'eau penalite", date, "REDAL", "0697663544");*/

            //adminService.saveAdmin(new Admin("Admin", "admin", "admin@admin.com"));
            //adminService.createAgent("agent", "agent", "CIN", "A123", new Date(), "marrakech", "agent@agent.com", "0697663544", "az1212","az1212");
            agentService.createUser("FinalUser", "FinalUser", "FinalUser", "nizar.elhilalii@gmail.com", "0636521478");

        };
    }
}


