package com.QuickClaim.NetHelp.DAO;

import com.QuickClaim.NetHelp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository  extends JpaRepository<User,Long> {
    void deleteUserById(Long id);
}
