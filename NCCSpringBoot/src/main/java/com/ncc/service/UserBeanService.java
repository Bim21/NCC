package com.ncc.service;

import org.springframework.stereotype.Service;

@Service
public class UserBeanService {
    private String name;

    public UserBeanService() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
