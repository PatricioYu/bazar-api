package com.bazar.service;

import com.bazar.model.Client;
import com.bazar.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {
    @Autowired
    private IClientRepository clientRepository;

    @Override
    public void postClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public void editClient(Long id, String newName, String newSurname, String newDni) {
        Client client = this.getClientById(id);
        client.setName(newName);
        client.setSurname(newSurname);
        client.setDni(newDni);
    }
}
