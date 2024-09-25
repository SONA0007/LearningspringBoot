package com.example;
public class App01
{
    public static void main( String[] args )
    {
        var marioGame = new MarioGame();
        var superContraGame = new SuperCntraGame();
//        we have to loosely couple the classes

        var pacMan = new PacMan();
        var gameRunner= new Game_runner(marioGame);
        var gameRunner2= new Game_runner(superContraGame);
        var gameRunner1= new Game_runner(pacMan);
        gameRunner2.run();
        gameRunner1.run();
        gameRunner.run();
        System.out.println( "Hello!! this is gaming world !" );
    }
}
