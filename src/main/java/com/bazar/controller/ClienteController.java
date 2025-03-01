package com.bazar.controller;

import com.bazar.model.Cliente;
import com.bazar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ClienteController {
    @Autowired
    private IClienteService intClienteService;

    @PostMapping (path = "/clientes")
    public void postClientes(@RequestBody Cliente cliente) {
        intClienteService.postCliente(cliente);
    }

    @GetMapping (path = "/clientes")
    public List<Cliente> getAllClientes() {
        return intClienteService.getAllCliente();
    }

    @GetMapping (path = "/clientes/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return intClienteService.getClienteById(id);
    }

    @DeleteMapping (path = "/clientes/{id}")
    public void deleteClienteById(@PathVariable Long id) {
        intClienteService.deleteCliente(id);
    }

    @PutMapping (path = "/clientes/{id}")
    public void editCliente(
            @PathVariable Long id,
            @RequestParam(required = false, name = "nombre") String nombre,
            @RequestParam(required = false, name = "apellido") String apellido,
            @RequestParam(required = false, name = "dni") String dni) {
        intClienteService.editCliente(id, nombre, apellido, dni);
    }
}
