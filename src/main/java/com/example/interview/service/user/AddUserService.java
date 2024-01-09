package com.example.interview.service.user;

import java.util.Map;

public interface AddUserService {
    public Map<String, String> addUser(Integer userId, String username, String password, Integer rating);
}
