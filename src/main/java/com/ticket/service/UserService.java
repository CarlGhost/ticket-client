package com.ticket.service;

import com.ticket.model.User;
import com.ticket.utils.ResultData;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getUser(Integer id) throws Exception;

    ResultData<User> getUserByMobilePhoneAndPassword(String mobilePhone, String password) throws Exception;

}
