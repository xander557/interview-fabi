package com.example.interview.controller.user;

import com.example.interview.service.user.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class AddUserController {

    @Autowired
    private AddUserService addUserService;
    @PostMapping("/api/user/account/addUser")
    public Map<String, String> register(@RequestParam Map<String, String> map) {
        String username = map.get("username");
        String password = map.get("password");
        Integer userId = Integer.valueOf(map.get("userId"));
        return addUserService.addUser(userId, username, password, 1500);
    }
}
