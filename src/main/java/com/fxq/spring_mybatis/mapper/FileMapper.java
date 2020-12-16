package com.fxq.spring_mybatis.mapper;

import com.fxq.spring_mybatis.domain.File;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface FileMapper{
    List<File> queryFileList();

    File queryFileById(Integer id);

    int deleteFileById(Integer id);

    int updateFileById(Integer id);

    int numberOfFile();

    int modify();
}
