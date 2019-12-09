package com.moreas.demo.service;

import com.moreas.demo.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(name = "person")
    public Person person() {
        System.out.println("================");
        Person person = new Person(12, "zhangsan");
        return  person;
    }

}