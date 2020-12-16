package com.fxq.spring_mybatis.service.userservice;

import com.fxq.spring_mybatis.domain.User;
import com.fxq.spring_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

    public User queryById(Integer id){
        return this.userMapper.queryUserById(id);
    }


//    @Transactional
    public int deleteUserById(Integer id){
        this.userMapper.deleteUserById(id);
        return 1;
    }

    public int insertUser(User user){
        return this.userMapper.insertUser(user);
    }

    public int updateUserById(User user){
        return this.userMapper.updateUserById(user);
    }


}
