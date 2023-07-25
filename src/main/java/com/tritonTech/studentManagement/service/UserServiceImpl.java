package com.tritonTech.studentManagement.service;

import com.tritonTech.studentManagement.dto.UserRegistrationDto;
import com.tritonTech.studentManagement.model.Role;
import com.tritonTech.studentManagement.model.User;
import com.tritonTech.studentManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(
                registrationDto.getFirstName(),
                registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),
                Arrays.asList(new Role("default_user"))
        );

        return userRepository.save(user);

    }
}
