package com.example.demo.controller;

import com.example.demo.entity.ErrorRecord;
import com.example.demo.entity.MotorInfo;
import com.example.demo.service.MotorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/motor")
public class MotorInfoController {

    @Autowired
    private MotorInfoService service;

    @RequestMapping("/get")
    @ResponseBody
    public List<MotorInfo> get()
    {
        return service.getMotorInfoRecord();
    }
}
