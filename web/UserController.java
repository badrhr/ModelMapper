package org.xproce.mapperclass.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.metadata.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xproce.mapperclass.dao.entities.User;
import org.xproce.mapperclass.dto.UserDto;
import org.xproce.mapperclass.dto.UserDtoNew;
import org.xproce.mapperclass.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public UserDto getUserById(@RequestParam Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public UserDto addUser(@RequestBody UserDtoNew user) {
        return userService.addUser(user);
    }
}
