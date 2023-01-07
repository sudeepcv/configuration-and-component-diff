package com.sudeep.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
    @Autowired
    @Qualifier("customPerson")
    Person customPerson;
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public ResponseEntity test(){
        System.out.println("name:"+customPerson.getName());
        System.out.println("age:"+customPerson.getAge());
       return ResponseEntity.ok().body("sudeep");

    }
}
