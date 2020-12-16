package com.fxq.spring_mybatis;

import com.fxq.spring_mybatis.domain.User;
import com.fxq.spring_mybatis.mapper.UserMapper;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringMybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;

    //注意test包是import org.junit.Test;
    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);


    }

}
