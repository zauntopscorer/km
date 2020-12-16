package com.fxq.spring_mybatis.mapper;

import com.fxq.spring_mybatis.domain.File;
import com.fxq.spring_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();

    //按id查询
    public User queryUserById(Integer id);

    public int deleteUserById(Integer id);

    public int insertUser(User user);

    int updateUserById(User user);
}
