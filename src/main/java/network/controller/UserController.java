package network.controller;

import network.domain.User;
import network.service.UserService;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String createUser(String name) {
        this.userService.create(new User(name));
        return "User created with name " + name;
    }
}
