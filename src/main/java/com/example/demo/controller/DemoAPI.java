package com.example.demo.controller;

import com.example.demo.entity.Demo;
import com.example.demo.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")    //localhost:8080/demo
public class DemoAPI {
    @Autowired
    public DemoServiceImpl demoServiceImpl;

    @PostMapping("/create")   //
    public Demo createRecord(@RequestBody Demo demo){
        return demoServiceImpl.createRecord(demo);
    }

    @GetMapping("/getrecord")
    public List<Demo> getRecord(){
        return demoServiceImpl.getRecord();
    }

}
