package com.ticket.service.impl;

import com.ticket.dao.user.UserDao;
import com.ticket.model.User;
import com.ticket.service.UserService;
import com.ticket.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Integer id) throws Exception {
        return userDao.getUserById(id);
    }

    @Override
    public ResultData<User> getUserByMobilePhoneAndPassword(String mobilePhone, String password) throws Exception {
        return userDao.getUserByMobilePhoneAndPassword(mobilePhone,password);
    }
}
