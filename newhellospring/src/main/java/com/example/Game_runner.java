package com.example;

public class Game_runner {
    GamingConsole game;
//    Game_runner is titly coupeled to mario game


    public Game_runner(GamingConsole marioGame) {
        this.game = marioGame;
    }
    public void run(){
        System.out.println(game + "game is running");
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }
}
