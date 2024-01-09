package com.example.interview.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.interview.mapper.UserMapper;
import com.example.interview.pojo.User;
import com.example.interview.service.user.GetUserByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserByNameImpl implements GetUserByNameService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserByName(String username) {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        List<User> users = userMapper.selectList(queryWrapper);

        return users;
    }
}
