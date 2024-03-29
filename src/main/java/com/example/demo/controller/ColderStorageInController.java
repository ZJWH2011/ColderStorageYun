package com.example.demo.controller;


import com.example.demo.entity.ColderStorageIn;
import com.example.demo.entity.ColderStorageOut;
import com.example.demo.service.ColderStorageInService;
import com.example.demo.service.ColderStorageOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/storageIn")
public class ColderStorageInController {

    @Autowired
    private ColderStorageInService colderStorageInService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public List<ColderStorageIn> get()
    {
        return colderStorageInService.getColderStorageInRecord();
    }
}
