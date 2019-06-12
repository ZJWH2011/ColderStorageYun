package com.example.demo.service;

import com.example.demo.entity.ErrorRecord;
import com.example.demo.mapper.ErrorCodeMapper;
import com.example.demo.userface.UserFaceDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ErrorCodeService implements UserFaceDef{

    @Autowired
    private ErrorCodeMapper errorCodeMapper;

    @Override
    public List<ErrorRecord> getErrorRecord()
    {
        return  errorCodeMapper.getErrorRecord();
    }

    @Override
    public void insertErrorRecord(ErrorRecord data)
    {
        errorCodeMapper.insertErrorRecord(data);
    }

    @Override
    @Transactional
    public void testAOP()
    {
        ErrorRecord data=new ErrorRecord();
        data.setSerial("D1111111");
        data.setId(34);
        data.setGenTime(new Date());
        data.setFlag(8);
        data.setCode("DAS");

        errorCodeMapper.insertErrorRecord(data);
        errorCodeMapper.insertErrorRecord(data);

        int asd = 1/0;

        throw new RuntimeException("抛异常了");
    }
}
