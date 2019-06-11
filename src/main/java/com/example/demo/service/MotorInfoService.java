package com.example.demo.service;

import com.example.demo.entity.MotorInfo;
import com.example.demo.mapper.MotorInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorInfoService {

    @Autowired
    private MotorInfoMapper motorInfoMapper;

    public List<MotorInfo> getMotorInfoRecord()
    {
        return motorInfoMapper.getMotorInfoRecord();
    }
}
