package demo.application.ws.ui.controller;

import demo.application.ws.service.UserService;
import demo.application.ws.shared.dto.UserDto;
import demo.application.ws.ui.model.request.UserDetailsRequestModel;
import demo.application.ws.ui.model.response.UserDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users_app")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "Get user has been called";
    }

    @PostMapping
    public UserDetailsResponseModel UserDetailsResponseModel(@RequestBody UserDetailsRequestModel userDetailsOfRequestModel) {

        UserDetailsResponseModel userDetailsResponseModel = new UserDetailsResponseModel();
        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetailsOfRequestModel, userDto);


        UserDto createUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createUser, userDetailsResponseModel);

        return userDetailsResponseModel;
    }

    @PutMapping
    public String updateUser() {
        return "Update user has been called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete user has been called";
    }
}
