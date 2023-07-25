package com.tritonTech.studentManagement.service;

import com.tritonTech.studentManagement.dto.UserRegistrationDto;
import com.tritonTech.studentManagement.model.User;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
