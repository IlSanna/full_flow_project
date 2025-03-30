package com.sanf.full_flow_project.service;

import be_module_model.UserDto;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import be_module_api.UsersApiController;

public class UsersApiControllerImpl extends UsersApiController {

    private final UserService userService;

    public UsersApiControllerImpl(NativeWebRequest request, UserService userService) {
        super(request);
        this.userService = userService;
    }

    @Override
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

}
