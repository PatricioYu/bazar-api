package com.bazar.service;

import ch.qos.logback.core.net.server.Client;
import com.bazar.model.Cliente;
import com.bazar.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepository;


    @Override
    public void postCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(Long idCliente) {
        return clienteRepository.findById(idCliente).orElse(null);
    }

    @Override
    public void deleteCliente(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }

    @Override
    public void editCliente(Long idCliente, String nuevoNombre, String nuevoApellido, String nuevoDni) {
        Cliente cliente = this.getClienteById(idCliente);
        cliente.setNombre(nuevoNombre);
        cliente.setApellido(nuevoApellido);
        cliente.setDni(nuevoDni);
    }
}
