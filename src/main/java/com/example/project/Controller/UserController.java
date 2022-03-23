package com.example.project.Controller;


import com.example.project.Entity.User;
import com.example.project.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserServices userServices;

    @GetMapping("/userDetails")
    public User getUserDetails( @RequestParam(required = true) Integer id){
        return userServices.getUserDetails(id);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody @Valid User user){

       userServices.addUser(user);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestBody @Valid User user){


         userServices.updateUser(user);

    }





}
