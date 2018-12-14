package org.hackaton.tekken._3_controllersREST;


import org.hackaton.tekken._1_persistence.model.User;
import org.hackaton.tekken._2_services.UserService;
import org.hackaton.tekken._4_DTO.UserDto;
import org.hackaton.tekken._5_converters.UserDtoToUser;
import org.hackaton.tekken._5_converters.UserToUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

/**
 *
 * Rest controller responsible for {@link User} to deal with CRUD operations
 */

@RestController
@RequestMapping("/api/user")
public class UserControllerREST {

    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private UserToUserDto userToUserDto;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @Autowired
    public void setUserToUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    /**
     * Adds a user
     *
     * @param userDto          the user DTO
     * @param bindingResult        the binding result object
     * @param uriComponentsBuilder the uri components builder
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<User> addUser(@Valid @RequestBody UserDto userDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors() || userDto.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User savedUser = userService.save(userDtoToUser.convert(userDto));

        // get help from the framework building the path for the newly created resource
        UriComponents uriComponents = uriComponentsBuilder.path("/api/user/" + savedUser.getId()).build();

        // set headers with the created path
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    /**
     * Retrieves a representation of the given user
     *
     * @param id the user id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<UserDto> showUser(@PathVariable Integer id) {

        User user = userService.get(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userToUserDto.convert(user), HttpStatus.OK);
    }
}
