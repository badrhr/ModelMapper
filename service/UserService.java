package org.xproce.mapperclass.service;

import org.xproce.mapperclass.dao.entities.User;
import org.xproce.mapperclass.dto.UserDto;
import org.xproce.mapperclass.dto.UserDtoNew;

public interface UserService {

    public UserDto getUserById(Long id);
    public UserDto addUser(UserDtoNew user);
}
