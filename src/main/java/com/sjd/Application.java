package com.sjd;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sjd.Model.Person;

//@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

/*
    @RequestMapping("/")
    Person home() {
        
        Person p = new Person();
        p.setName("Steve Davis");
        p.setAge(46);
        p.addChild("Adam Davis", 8);

        return p;
    }
*/
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}