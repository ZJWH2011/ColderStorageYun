package com.example.demo.mapper;

import com.example.demo.entity.MotorInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MotorInfoMapper {
    @Select("SELECT * FROM TColdStorageMotorInfo order by id")
    List<MotorInfo> getMotorInfoRecord();
}
