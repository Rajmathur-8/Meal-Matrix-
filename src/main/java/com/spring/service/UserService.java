package com.spring.service;

import com.spring.model.User;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception;
    public User findUserbyEmail(String email) throws Exception;
}
