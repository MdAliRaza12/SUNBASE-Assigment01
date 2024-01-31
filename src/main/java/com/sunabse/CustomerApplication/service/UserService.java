package com.sunabse.CustomerApplication.service;

import com.sunabse.CustomerApplication.model.User;
import com.sunabse.CustomerApplication.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public List<User> getUsers(){
        return userRepo.findAll();
    }
    public String createUser(User user){
         userRepo.save(user);
         return "User Created !!";
    }

}
