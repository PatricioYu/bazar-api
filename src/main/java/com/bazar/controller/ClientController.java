package com.bazar.controller;

import com.bazar.model.Client;
import com.bazar.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private IClientService intClientService;

    @PostMapping (path = "/clients")
    public void postClient(@RequestBody Client cliente) {
        intClientService.postClient(cliente);
    }

    @GetMapping (path = "/clients")
    public List<Client> getAllClients() {
        return intClientService.getAllClients();
    }

    @GetMapping (path = "/clients/{id}")
    public Client getClientById(@PathVariable Long id) {
        return intClientService.getClientById(id);
    }

    @DeleteMapping (path = "/clients/{id}")
    public void deleteClientById(@PathVariable Long id) {
        intClientService.deleteClient(id);
    }

    @PutMapping (path = "/clients/{id}")
    public void editClient(
            @PathVariable Long id,
            @RequestParam(required = false, name = "name") String name,
            @RequestParam(required = false, name = "surname") String surname,
            @RequestParam(required = false, name = "dni") String dni) {
        intClientService.editClient(id, name, surname, dni);
    }
}
