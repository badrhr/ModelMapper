package org.xproce.mapperclass.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.mapperclass.dao.entities.User;
import org.xproce.mapperclass.dto.UserDto;
import org.xproce.mapperclass.dto.UserDtoNew;

@Component
public class UserMapper {

    ModelMapper mapper = new ModelMapper();

    public UserDto fromUserToUserDto(User user){
        return mapper.map(user, UserDto.class);
    }

    public User fromUserDtoToUser(UserDto userDto){
        return mapper.map(userDto, User.class);
    }

    public User fromUserDtoNewToUser(UserDtoNew userDtoNew){
        return mapper.map(userDtoNew, User.class);
    }
}
