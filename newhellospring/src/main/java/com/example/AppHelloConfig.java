package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){}
record Address(String firstLine, String City){}
@Configuration
public class AppHelloConfig {
    @Bean
    public  String name() {
        return "Sonal";
    }
    @Bean
    public  int  Age() {
        return 23;
    }
    @Bean
    public Person person(){
        return  new Person("Somesh",22, new Address("lahor","road"));
    }
    @Bean
    public Person person2(){
        return  new Person("Sahil",22, address());
    }
    @Bean (name = "address")
    public Address address(){
        return new Address("Ganesh Nagar","Pathri");
    }
    @Bean (name = "address")
    public Address address2(){
        return new Address("Aurangabad","waluj");
    }
    @Bean
    public  Person person1Methodcall(){
        return new Person("ravi",14, new Address("pune","pimpri"));
    }
//    error found 2 beans
    @Bean
    public Person person3para(String name, int age, Address address){
        return new Person(name, age, address);
    }

}
