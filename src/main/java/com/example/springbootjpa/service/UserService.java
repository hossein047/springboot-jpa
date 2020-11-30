package com.example.springbootjpa.service;

import com.example.springbootjpa.model.User;
import com.example.springbootjpa.repository.UserRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User login(String userName,String password) throws Exception {
        boolean flag=false;
        User user=repository.findByUsernameAndPassword(userName, password);
        if (user!=null){
            return  user;
        }else {
            throw new Exception("not found");
        }
    }
}
