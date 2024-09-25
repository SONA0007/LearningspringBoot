package com.SpringbootNew;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldConfigure {
    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello my first controller !";
    }
}

