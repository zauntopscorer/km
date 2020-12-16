package com.fxq.spring_mybatis.controller;

import com.fxq.spring_mybatis.domain.File;
import com.fxq.spring_mybatis.domain.User;
import com.fxq.spring_mybatis.mapper.FileMapper;
import com.fxq.spring_mybatis.service.fileService.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("file")
public class FileController {
    @Autowired
    public FileMapper fileMapper;
    @Autowired
    public FileService fileService;

    @RequestMapping("/showFiles")
    @ResponseBody
    public List<File> queryFile(){
        return this.fileService.queryAll();
    }

    @GetMapping("showAll")
    public String toUsers(Model model){
        List<File> files = this.fileMapper.queryFileList();
//        System.out.println("访问成功");
        model.addAttribute("files",files);
//        System.out.println(users);
        return "files";
    }

    @RequestMapping("numberOfFile")
    @ResponseBody
    public int numberOfFile(){return this.fileService.numberOfFile();}



//    @RequestMapping("numberOfFile")
//    @ResponseBody
//    public int modifyFile(){}
}
