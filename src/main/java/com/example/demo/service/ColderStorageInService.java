package com.example.demo.service;

import com.example.demo.entity.ColderStorageIn;
import com.example.demo.mapper.ColderStorageInMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColderStorageInService {

    @Autowired
    private ColderStorageInMapper colderStorageInMapper;

    public List<ColderStorageIn> getColderStorageInRecord()
    {
        return colderStorageInMapper.getColderStorageInRecord();
    }
}
