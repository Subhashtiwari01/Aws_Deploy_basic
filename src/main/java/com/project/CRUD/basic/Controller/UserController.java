package com.project.CRUD.basic.Controller;

import com.project.CRUD.basic.Model.User;
import com.project.CRUD.basic.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("addUser")

    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("getUser")
    public Iterable<User> getUser(){
        return userService.getUser();
    }

    @DeleteMapping("deleteUser")

    public String deleteUser(@RequestBody User user){
        return userService.deleteUser(user);
    }

    @PutMapping("updateUser/{userId}")

    public String updateUser(@PathVariable Long userId,@RequestBody User user){
        return userService.updateUser(userId,user);
    }
}
