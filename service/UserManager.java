package org.xproce.mapperclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.mapperclass.dao.entities.User;
import org.xproce.mapperclass.dao.repositories.UserRepository;
import org.xproce.mapperclass.dto.UserDto;
import org.xproce.mapperclass.dto.UserDtoNew;
import org.xproce.mapperclass.mapper.UserMapper;

@Service
public class UserManager implements UserService {

    @Autowired
    UserRepository userRepository;


    @Autowired
    UserMapper userMapper ;


    @Override
    public UserDto getUserById(Long id) {
        return userMapper.fromUserToUserDto(userRepository.findById(id).get());
    }

    @Override
    public UserDto addUser(UserDtoNew userDtoNew) {

        return userMapper.fromUserToUserDto(
                userRepository.save(
                        userMapper.fromUserDtoNewToUser(userDtoNew)));


    }
}
