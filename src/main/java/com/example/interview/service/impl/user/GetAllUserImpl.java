package com.example.interview.service.impl.user;

import com.example.interview.mapper.UserMapper;
import com.example.interview.pojo.User;
import com.example.interview.service.user.GetAllUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllUserImpl implements GetAllUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUserAll() {
        return userMapper.selectList(null);
    }




}
