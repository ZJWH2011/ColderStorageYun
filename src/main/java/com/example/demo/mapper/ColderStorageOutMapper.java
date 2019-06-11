package com.example.demo.mapper;

import com.example.demo.entity.ColderStorageOut;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ColderStorageOutMapper {

//    @Results({
//            @Result(property = "serial",column = "serial")
//    })
    @Select("SELECT * FROM TColderStorageOut ORDER BY id")
    List<ColderStorageOut> getStorageOutRecord();
}
