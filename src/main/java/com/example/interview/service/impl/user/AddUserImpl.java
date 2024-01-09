package com.example.interview.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.interview.mapper.UserMapper;
import com.example.interview.pojo.User;
import com.example.interview.service.user.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AddUserImpl implements AddUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public Map<String, String> addUser(Integer userId, String username, String password, Integer rating) {
        Map<String, String> map = new HashMap<>();
        if (username == null) {
            map.put("error_message", "User name cannot be empty");
            return map;
        }
        if (password == null) {
            map.put("error_message", "password cannot be emtpy");
            return map;
        }

        username = username.trim();
        if (username.length() == 0) {
            map.put("error_message", "User name cannot be empty");
            return map;
        }

        if (password.length() == 0) {
            map.put("error_message", "Password cannot be empty");
            return map;
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        List<User> users = userMapper.selectList(queryWrapper);
        if (!users.isEmpty()) {
            map.put("error_message", "User Name exists");
            return map;
        }

        User user = new User(userId, username, password, 1500);
        userMapper.insert(user);

        map.put("error_message", "success");
        return map;
    }
}

