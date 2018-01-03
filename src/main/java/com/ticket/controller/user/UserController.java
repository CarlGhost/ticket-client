package com.ticket.controller.user;

import com.ticket.controller.BaseController;
import com.ticket.model.User;
import com.ticket.service.UserService;
import com.ticket.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/user", produces = "application/json;charset=UTF-8")
public class UserController extends BaseController {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public ResultData<User> getUser(Integer id) {
        try {
            return ResultData.ok(userService.getUser(id));
        } catch (Exception e) {
            LOGGER.error("根据id获取用户数据异常", e);
            return ResultData.error(ResultData.EXCEPTION);
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    public ResultData<Map<String, Object>> login(String mobilePhone, String password) {
        LOGGER.info("接受到用户登录请求,mobilePhone = {},password = {}", mobilePhone, password);

        return null;
    }
}