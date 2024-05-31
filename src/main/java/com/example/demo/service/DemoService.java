package com.example.demo.service;


import com.example.demo.entity.Demo;

import java.util.List;

public interface DemoService {
    public Demo createRecord(Demo demo);
    public List<Demo> getRecord();
}
