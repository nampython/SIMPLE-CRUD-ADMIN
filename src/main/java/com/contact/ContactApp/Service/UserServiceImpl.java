package com.contact.ContactApp.Service;

import java.util.List;
import com.contact.ContactApp.Model.User_1;
import com.contact.ContactApp.Repository.UserRepo;
import com.contact.ContactApp.Repository.UserRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepositoryImpl userRepo;

    @Override
    public User_1 findUserByUsername(String username) {
        return userRepo.findUserByUsername(username);
    }

    @Override
    public int update(User_1 user) {
        
        return userRepo.update(user);
    }

    @Override
    public int save(User_1 user) {
  
        return userRepo.save(user);
    }

    @Override
    public int delete(String username) {
  
        return userRepo.delete(username);
    }

    @Override
    public List<User_1> getAllUsers() {
        return userRepo.getAllUsers();
    }
    
}
