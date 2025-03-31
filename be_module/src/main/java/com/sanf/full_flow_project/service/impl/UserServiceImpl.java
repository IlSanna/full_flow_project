package com.sanf.full_flow_project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanf.full_flow_project.mappers.UserMapper;
import com.sanf.full_flow_project.repositories.UserRepository;
import com.sanf.full_flow_project.service.UserService;

import be_module_model.UserDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::mapUsers)
                .toList();
    }

}
