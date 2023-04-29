package com.example.k8s_springboot.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class DataRepository {

    public String getData(){
        log.info("Returning Data from Data Repository");
        return "SUCCESS - 200";
    }

}
