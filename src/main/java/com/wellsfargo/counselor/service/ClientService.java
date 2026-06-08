package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // SAVE CLIENT
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    // GET ALL CLIENTS
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // GET CLIENT BY ID
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    // DELETE CLIENT
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}