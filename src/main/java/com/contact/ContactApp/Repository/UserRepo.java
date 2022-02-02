package com.contact.ContactApp.Repository;

import java.util.ArrayList;
import java.util.List;

import com.contact.ContactApp.Model.User_1;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo implements UserRepositoryImpl{
    public static List<User_1> ls = new ArrayList<User_1>();

    @Override
    public User_1 findUserByUsername(String username) {
        for (User_1 user : ls) {
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public int update(User_1 user) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getUsername().equals(user.getUsername())){
                ls.set(i, user);
                return i;
            }
        }
        return -1;
    }

    @Override
    public int save(User_1 user) {
        if (findUserByUsername(user.getUsername()) != null){
            update(user);
        }
        else{
            ls.add(user);
        }
        return 1;
    }

    @Override
    public int delete(String username) {
        User_1 user = findUserByUsername(username);
        if (user != null){
            ls.remove(user);
            return 1;
        }
        return 0;
    }

    @Override
    public List<User_1> getAllUsers() {

        return ls;
    }

    
}
