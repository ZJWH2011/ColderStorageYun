package com.example.demo.service;

import com.example.demo.entity.ColderStorageOut;
import com.example.demo.mapper.ColderStorageOutMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColderStorageOutService {

    @Autowired
    private ColderStorageOutMapper colderStorageOutMapper;

    public List<ColderStorageOut> getStorageOutRecord()
    {
        return colderStorageOutMapper.getStorageOutRecord();
    }
}
