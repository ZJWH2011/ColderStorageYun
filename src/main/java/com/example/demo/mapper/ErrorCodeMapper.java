package com.example.demo.mapper;

import com.example.demo.entity.ErrorRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface ErrorCodeMapper{

    @Select("SELECT * FROM TErrorRecord order by id")
    List<ErrorRecord> getErrorRecord();

    @Insert("INSERT INTO TErrorRecord(serial,flag,code,genTime) VALUES(#{serial},#{flag},#{code},#{genTime})")
    void insertErrorRecord(ErrorRecord data);
}
