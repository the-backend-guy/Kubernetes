package com.example.k8s_springboot.controller;

import com.example.k8s_springboot.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/getData")
    public String getData(){
        return dataRepository.getData();
    }
}
