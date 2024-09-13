package com.QuickClaim.NetHelp.Service;

import com.QuickClaim.NetHelp.DAO.UserRepository;
import com.QuickClaim.NetHelp.Models.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public UserService() {}

    public List<User> getAllUsers(){return userRepository.findAll();}
    public User addUser(User user){
        return userRepository.save(user);
    }
    public User updateUser(User user){
        return userRepository.save(user);
    }
    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteUserById(id);
    }
}
