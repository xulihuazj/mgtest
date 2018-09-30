package com.xulihuazj.mgsubtest.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String loginHandler(String username, String password) {
        return "login successfully!";
    }
}
