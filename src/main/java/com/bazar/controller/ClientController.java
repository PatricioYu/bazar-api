package com.bazar.controller;

import com.bazar.model.Client;
import com.bazar.service.IClientService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/clients",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {
    private final IClientService intClientService;

    public ClientController(IClientService intClientService) {
        this.intClientService = intClientService;
    }

    @PostMapping
    public void postClient(@RequestBody Client client) {
        intClientService.postClient(client);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return intClientService.getAllClients();
    }

    @GetMapping (path = "/{id}")
    public Client getClientById(@PathVariable Long id) {
        return intClientService.getClientById(id);
    }

    @DeleteMapping (path = "/{id}")
    public void deleteClientById(@PathVariable Long id) {
        intClientService.deleteClient(id);
    }

    @PutMapping (path = "/{id}")
    public void editClient(
            @PathVariable Long id,
            @RequestParam(required = false, name = "name") String name,
            @RequestParam(required = false, name = "surname") String surname,
            @RequestParam(required = false, name = "dni") String dni) {
        intClientService.editClient(id, name, surname, dni);
    }
}
