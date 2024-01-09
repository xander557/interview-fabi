package com.example.interview.service.user;

import com.example.interview.pojo.User;

import java.util.List;

public interface GetUserByNameService {

    List<User> getUserByName(String name);
}
