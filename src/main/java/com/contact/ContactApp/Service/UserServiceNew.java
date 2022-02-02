package com.contact.ContactApp.Service;

import java.util.List;
import java.util.Optional;

import com.contact.ContactApp.Model.User_1;

public interface UserServiceNew {
    void deleteAll();
    void deleteAll(List<User_1> entities);
    void delete(User_1 user);
    void deleteById(String id);
    long count();
    Optional<User_1> findById(List<String> ids);
    Iterable<User_1> findAll();
    boolean existsById(String id);
    Optional<User_1> findById(String id);
    User_1 save(User_1 entities);
}
