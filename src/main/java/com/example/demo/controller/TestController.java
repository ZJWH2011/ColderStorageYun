package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.ErrorRecord;
import com.example.demo.service.ErrorCodeService;
import com.example.demo.userface.UserFaceDef;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/errorcode")
@MapperScan("com.example.demo.service")
public class TestController {

    @Autowired
    private UserFaceDef errorCodeService;

    @RequestMapping("/me")
    public String getMe() {
        JSONObject json = new JSONObject();
        json.put("response", "ok");
        //return json.toString();

        ErrorRecord recod = new ErrorRecord();
        recod.setCode("DFF");
        recod.setFlag(2);
        recod.setGenTime(new Date());
        recod.setId(6);
        recod.setSerial("M87979");
        return JSONObject.toJSONString(recod);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<ErrorRecord> get() {
        return errorCodeService.getErrorRecord();
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public void insertErrorCode(@RequestBody ErrorRecord data) {
        errorCodeService.insertErrorRecord(data);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test() {
        errorCodeService.testAOP();
    }
}