package com.contact.ContactApp.Service;

import java.util.List;
import java.util.Optional;

import com.contact.ContactApp.Model.User_1;
import com.contact.ContactApp.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplNew implements UserServiceNew{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void deleteAll() {
       
        
    }

    @Override
    public void deleteAll(List<User_1> entities) {
 
        
    }

    @Override
    public void delete(User_1 user) {

        
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Optional<User_1> findById(List<String> ids) {
        return null;
        // return (List<User_1>) userRepository,
    }

    @Override
    public Iterable<User_1> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean existsById(String id) {
        return userRepository.existsById(id);
    }

    @Override
    public Optional<User_1> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User_1 save(User_1 entities) {
        return userRepository.save(entities);
    }
    
}
