package com.QuickClaim.NetHelp.DAO;

import com.QuickClaim.NetHelp.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    void deleteClientById(Long id);
}
