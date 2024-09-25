package com.example;
public class MarioGame implements GamingConsole {
    public  void Up(){
        System.out.println("Jump!");
    }
    public  void Down(){
        System.out.println("Moving into the Hole!");
    }
    public  void Left(){
        System.out.println("Moving backward!");
    }
    public  void Right(){
        System.out.println("Moving forward!");
    }
}
