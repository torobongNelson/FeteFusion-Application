package com.fetefusion.FeteFusion.Controller;

import com.fetefusion.FeteFusion.Dtos.Request.UserRegistrationRequest;
import com.fetefusion.FeteFusion.Model.User;
import com.fetefusion.FeteFusion.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> create(@RequestBody UserRegistrationRequest request){
       userService.createAccount(request);
       return ResponseEntity.status(HttpStatus.CREATED).body("User Created successfully");
    }
}
