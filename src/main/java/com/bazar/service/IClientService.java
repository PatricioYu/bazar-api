package com.bazar.service;

import com.bazar.model.Client;

import java.util.List;

public interface IClientService {
    public void postClient(Client cliente);
    public List<Client> getAllClients();
    public Client getClientById(Long idCliente);
    public void deleteClient(Long idCliente);
    public void editClient(Long idCliente, String nuevoNombre, String nuevoApellido, String nuevoDni);
}
