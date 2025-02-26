package com.bazar.service;

import ch.qos.logback.core.net.server.Client;
import com.bazar.model.Cliente;
import com.bazar.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IClienteService {
    public void postCliente(Cliente cliente);
    public List<Cliente> getAllCliente();
    public Cliente getClienteById(Long idCliente);
    public void deleteCliente(Long idCliente);
    public void editCliente(Long idCliente, String nuevoNombre, String nuevoApellido, String nuevoDni);
}
