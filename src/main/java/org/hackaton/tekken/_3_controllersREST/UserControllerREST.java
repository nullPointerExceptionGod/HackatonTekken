package org.hackaton.tekken._3_controllersREST;


import org.hackaton.tekken._2_services.UserService;
import org.hackaton.tekken._5_converters.UserDtoToUser;
import org.hackaton.tekken._5_converters.UserToUserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserControllerREST {

    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private UserToUserDto userToUserDto;


}
