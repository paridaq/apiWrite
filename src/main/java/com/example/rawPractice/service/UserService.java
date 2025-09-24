package com.example.rawPractice.service;

import com.example.rawPractice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserService {

    public List<User>getAllUsers();
}
