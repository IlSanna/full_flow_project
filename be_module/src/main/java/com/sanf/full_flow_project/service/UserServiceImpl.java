package com.sanf.full_flow_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanf.full_flow_project.models.User;
import com.sanf.full_flow_project.repositories.UserRepository;

import be_module_model.State;
import be_module_model.UserDto;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        // Implement the logic to get all users
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> {
            UserDto userDto = new UserDto();

            userDto.setTasks(user.getTasks().stream().map(task -> {
                be_module_model.Task taskDto = new be_module_model.Task();
                taskDto.setUser(userDto);
                taskDto.setState(State.fromValue(task.getState().name()));
                taskDto.setDescription(task.getDescription());
                return taskDto;
            }).toList());

            userDto.setUserName(user.getUserName());

            return userDto;
        }).toList();
    }

}
