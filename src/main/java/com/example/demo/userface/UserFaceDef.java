package com.example.demo.userface;

import com.example.demo.entity.ErrorRecord;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserFaceDef {
    List<ErrorRecord> getErrorRecord();
    void insertErrorRecord(ErrorRecord data);
    void testAOP();
}
