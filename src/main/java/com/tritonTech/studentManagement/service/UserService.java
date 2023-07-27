package com.tritonTech.studentManagement.service;

import com.tritonTech.studentManagement.dto.UserRegistrationDto;
import com.tritonTech.studentManagement.model.User;

import java.util.List;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
    User findUserByEmail(String email);

    List<UserRegistrationDto> findAllUsers();
}
