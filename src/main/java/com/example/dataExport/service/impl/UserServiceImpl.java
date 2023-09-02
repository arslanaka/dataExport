package com.example.dataExport.service.impl;

import com.example.dataExport.entity.User;
import com.example.dataExport.repository.UserRepository;
import com.example.dataExport.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listAll() {
        return userRepository.findAll(Sort.by("email").ascending());
    }
}
