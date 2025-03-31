package com.sanf.full_flow_project.controllers.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sanf.full_flow_project.service.UserService;

import be_module_api.UsersApi;
import be_module_model.TaskDto;
import be_module_model.UserDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserApiImpl implements UsersApi {

    private final UserService userService;

    @Override
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @Override
    public ResponseEntity<List<TaskDto>> getUserTasks(Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserTasks'");
    }

}
