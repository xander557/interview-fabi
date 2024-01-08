package com.example.interview.controller.user;

import com.example.interview.mapper.UserMapper;
import com.example.interview.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/all")
    public List<User> getAll(){
        return userMapper.selectList(null);
    }
    @GetMapping("user/{userId}")
    public User getuser(@PathVariable int userId) {

        return userMapper.selectById(userId);
    }
}
