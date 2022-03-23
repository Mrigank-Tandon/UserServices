package com.example.project.Services;

import com.example.project.Entity.User;
import com.example.project.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServicesImplementation implements UserServices
{
    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserDetails(Integer userId) {
        Optional<User> user = userRepository.findById(userId);
        User user1 = user.get();
        return user1;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);

    }

    @Override
    public User updateUser(User user) {
        userRepository.save(user);
        return user;
    }
}
