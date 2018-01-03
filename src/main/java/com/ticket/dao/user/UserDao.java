package com.ticket.dao.user;

import com.ticket.dao.BaseDao;
import com.ticket.model.User;
import com.ticket.utils.ResultData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao extends BaseDao {

    public User getUserById(Integer userId) throws Exception {
        return this.getSqlSession().selectOne("com.ticket.dao.User.queryUserByUserId", userId);
    }

    public ResultData<User> getUserByMobilePhoneAndPassword(String mobilePhone, String password) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mobilePhone", mobilePhone);
        params.put("password", password);
        return this.getSqlSession().selectOne("com.ticket.dao.User.getUserByMobilePhoneAndPassword", params);
    }


}

