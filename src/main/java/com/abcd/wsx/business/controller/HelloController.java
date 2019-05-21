package com.abcd.wsx.business.controller;

import com.abcd.wsx.business.service.XyqInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/xyq")
public class HelloController {


    @Autowired
    private XyqInfo xyqInfo;


    @GetMapping(value = "/get")
    public List<String> getServerList(){
        return xyqInfo.findAllServer();
    }

    @GetMapping(value = "/find")
    public String findName(){
        return xyqInfo.queryServerStartTime("映月湖");
    }
}
