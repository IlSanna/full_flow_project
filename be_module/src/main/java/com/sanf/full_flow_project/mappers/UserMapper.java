package com.sanf.full_flow_project.mappers;

import org.springframework.stereotype.Component;

import com.sanf.full_flow_project.models.Task;
import com.sanf.full_flow_project.models.User;

import be_module_model.StateDto;
import be_module_model.TaskDto;
import be_module_model.UserDto;

@Component
public class UserMapper {

    public UserDto mapUsers(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId().intValue());
        userDto.setUserName(user.getUserName());
        userDto.setTasks(user.getTasks().stream()
                .map(this::mapTasks)
                .toList());

        return userDto;
    }

    public TaskDto mapTasks(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId().intValue());
        taskDto.setState(StateDto.fromValue(task.getState().name()));
        taskDto.setDescription(task.getDescription());
        taskDto.setUserId(task.getUser().getId().intValue());
        return taskDto;
    }
}
