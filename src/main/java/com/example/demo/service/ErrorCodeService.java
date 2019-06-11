package com.example.demo.service;

import com.example.demo.entity.ErrorRecord;
import com.example.demo.mapper.ErrorCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErrorCodeService{

    @Autowired
    private ErrorCodeMapper errorCodeMapper;

    public List<ErrorRecord> getErrorRecord()
    {
        return  errorCodeMapper.getErrorRecord();
    }

    public void insertErrorRecord(ErrorRecord data)
    {
        errorCodeMapper.insertErrorRecord(data);
    }
}
