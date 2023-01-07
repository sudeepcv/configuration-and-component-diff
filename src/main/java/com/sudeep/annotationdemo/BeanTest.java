package com.sudeep.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration //@Bean will be wrapped into a CGLIB wrapper
//@Component  // if it is used it is treated as lite mode and @Bean will not be wrapped into a CGLIB wrapper
public class BeanTest {

    @Bean
    public Person customPerson(){
        Person person=new Person();
        person.setAge(32);
        person.setName("test");
        return  person;
    }
    @Bean
    public RestTemplate customRestTemplate(){
        customPerson();
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate;
    }
}
