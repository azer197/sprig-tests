package com.QuickClaim.NetHelp.Service;

import com.QuickClaim.NetHelp.DAO.ClientRepository;
import com.QuickClaim.NetHelp.Models.Client;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public ClientService() {}

    public List<Client> getAllClients(){return clientRepository.findAll();}
    public Client addClient(Client client){
        return clientRepository.save(client);
    }
    public Client updateClient(Client client){
        return clientRepository.save(client);
    }
    @Transactional
    public void deleteClient(Long id){
        clientRepository.deleteClientById(id);
    }

}
