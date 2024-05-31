package com.example.demo.service.impl;

import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    public DemoRepository demoRepository;

    @Override
    public Demo createRecord(Demo demo) {
        return demoRepository.save(demo);

    }

    @Override
    public List<Demo> getRecord() {
        return demoRepository.findAll();
    }


}