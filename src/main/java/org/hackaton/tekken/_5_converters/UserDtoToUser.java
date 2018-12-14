package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.User;
import org.hackaton.tekken._2_services.UserService;
import org.hackaton.tekken._4_DTO.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUser implements Converter<UserDto, User> {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User convert(UserDto userDto) {

        User user = (userDto.getId() != null ? userService.get(userDto.getId()) : new User());

        user.setUsername(userDto.getUsername());

        return user;
    }
}
