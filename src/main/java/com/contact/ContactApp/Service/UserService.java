package com.contact.ContactApp.Service;

import java.util.List;

import com.contact.ContactApp.Model.User_1;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    User_1 findUserByUsername(String username);
    int update(User_1 user);
    int save(User_1 user);
    int delete(String username);
    List<User_1> getAllUsers();
}
