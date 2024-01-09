package com.example.interview.controller.user;

import com.example.interview.pojo.User;
import com.example.interview.service.user.GetAllUserService;
import com.example.interview.service.user.GetUserByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllUserController {
    @Autowired
    GetAllUserService getAllUserService;
    @Autowired
    GetUserByNameService getUserByNameService;

    @GetMapping("/api/user/all")
    public List<User> getUserAll() {
        return getAllUserService.getUserAll();
    }




}
