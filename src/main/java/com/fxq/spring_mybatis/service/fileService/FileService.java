package com.fxq.spring_mybatis.service.fileService;

import com.fxq.spring_mybatis.domain.File;
import com.fxq.spring_mybatis.domain.User;
import com.fxq.spring_mybatis.mapper.FileMapper;
import com.fxq.spring_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    @Autowired
    private FileMapper fileMapper;

    public List<File> queryAll(){
        List<File> files = fileMapper.queryFileList();
//        File file = files.get(0);
//        System.out.println(file.getId());
        return files;
    }

    //查询文件数
    public int numberOfFile(){return this.fileMapper.numberOfFile();}

    //删除文件，1.获取文件id 2.查询别的表
    public int delFile(Integer id){
        return this.fileMapper.deleteFileById(id);
    }

//    public User queryById(Integer id){
//        return this.userMapper.queryUserById(id);
//    }
//
//
//    //    @Transactional
//    public int deleteUserById(Integer id){
//        this.userMapper.deleteUserById(id);
//        return 1;
//    }
//
//    public int insertUser(User user){
//        return this.userMapper.insertUser(user);
//    }
//
//    public int updateUserById(User user){
//        return this.userMapper.updateUserById(user);
//    }
}
