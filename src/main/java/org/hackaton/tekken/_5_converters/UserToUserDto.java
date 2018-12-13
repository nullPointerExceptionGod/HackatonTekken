package org.hackaton.tekken._5_converters;

import org.hackaton.tekken._1_persistence.model.User;
import org.hackaton.tekken._4_DTO.UserDto;

public class UserToUserDto extends AbstractConverter<User, UserDto> {



    /**
     * Converts the user model object into a user DTO
     *
     * @param user the user
     * @return the customer DTO
     */
    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());

        return userDto;
    }


}
