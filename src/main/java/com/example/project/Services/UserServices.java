package com.example.project.Services;

import com.example.project.Entity.User;

public interface UserServices {

     User getUserDetails(Integer userId);
     void addUser(User user);
     User updateUser(User user);


}
