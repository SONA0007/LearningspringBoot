package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {
    public static void main(String[] args) {
//      1. Launching Spring Context
        var context = new AnnotationConfigApplicationContext(AppHelloConfig.class);
//      2. Configure things that we want Spring to manage

//        retreving bean created by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean(Address.class));
//        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("Age"));
        System.out.println(context.getBean("person1Methodcall"));
        System.out.println(context.getBean("person3para"));


    }
}
