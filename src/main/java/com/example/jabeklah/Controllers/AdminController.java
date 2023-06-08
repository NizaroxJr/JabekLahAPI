package com.example.jabeklah.Controllers;

import com.example.jabeklah.models.Admin;
import com.example.jabeklah.models.Agent;
import com.example.jabeklah.models.UserApp;
import com.example.jabeklah.service.AdminService;
import com.example.jabeklah.service.AgentFileService;
import com.example.jabeklah.service.AgentService;
import com.example.jabeklah.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/adminController")
@RequiredArgsConstructor

public class AdminController {

    private final AdminService adminService;
    private final AgentService agentService;
    private final UserService userService;

    @Autowired
    private  AgentFileService agentFileService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Admin check(@RequestBody String uid) throws IOException {

        return adminService.checkAdminExists(uid);

    }

    @GetMapping("/admin")
    public ResponseEntity<List<Admin>> getAdmins() {
        return ResponseEntity.ok().body(adminService.getAdmins());
    }


    @GetMapping("/listAgents")
    public ResponseEntity<List<Agent>>  getAgents() {
        return ResponseEntity.ok().body(
                adminService.getAgents());
    }

    @GetMapping("/listClients")
    public ResponseEntity<List<UserApp>> getClients() {
        return ResponseEntity.ok().body(agentService.getUsers());
    }




}

