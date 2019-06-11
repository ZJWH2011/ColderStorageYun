package com.example.demo.mapper;

import com.example.demo.entity.ColderStorageIn;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ColderStorageInMapper {

    @Select("SELECT * FROM TColderStorageIn ORDER BY id")
    List<ColderStorageIn> getColderStorageInRecord();
}
