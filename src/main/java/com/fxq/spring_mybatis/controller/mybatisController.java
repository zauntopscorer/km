package com.fxq.spring_mybatis.controller;

import com.fxq.spring_mybatis.domain.User;
import com.fxq.spring_mybatis.mapper.UserMapper;
import com.fxq.spring_mybatis.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class mybatisController {
    //向springboot注入userService
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody//响应接口数据
    public String test(){
        return "springBoot OK";
    }

    @RequestMapping("/showUsers")
    @ResponseBody//响应接口数据
    public List<User> queryUser(){
        return this.userService.queryAll();
    }

    @GetMapping("/showUser{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id")Integer id){//占位符{id}参数，使用@PathVariable接受
        return this.userService.queryById(id);
    }

    @GetMapping("/deleteUser{id}")
    @ResponseBody
    public void deleteUserById(@PathVariable("id")Integer id){
        this.userService.deleteUserById(id);
    }

//    @GetMapping("showAll")
//    public String toUsers(Model model){
//        List<User> users = this.userService.queryAll();
//        model.addAttribute("users",users);
//        return "users";
//    }

    @RequestMapping("addUser")
    @ResponseBody
    public int addUser(){
        User temp = new User();
        temp.setUserName("ddd");
        temp.setPassword("234567");
        System.out.println(temp);
        return userService.insertUser(temp);
    }

    @RequestMapping("updateUser{id}")
    @ResponseBody
    public int updateUserById(@PathVariable("id")Integer id){
        User temp = new User();
        temp.setId(id);
        temp.setUserName("ccc");
        temp.setPassword("123456");
        System.out.println(temp+" "+id);
        return userService.updateUserById(temp);//修改成功返回1
    }



    @GetMapping("showAll")
    public String toUsers(Model model){
        List<User> users = this.userMapper.queryUserList();
//        System.out.println("访问成功");
        model.addAttribute("users",users);
//        System.out.println(users);
        return "users";
    }
}
