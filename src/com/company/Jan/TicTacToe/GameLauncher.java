package com.company.Jan.TicTacToe;

import java.lang.management.PlatformLoggingMXBean;

public class GameLauncher {
    public static void main(String[] args) {
        Game games = new Game("Vaibhav","Utkarsh","Atul");
        games.startGame();

    }
}
class Game
{
    Player p1;
    Player p2;
    Player p3;
    Game(String name1, String name2, String name3)
    {
        p1=new Player(name1);
        p2=new Player(name2);
        p3=new Player(name3);
    }
    void startGame()
    {
        int expectedGuess = (int)(Math.random()*10);
        System.out.println(expectedGuess);
        while(true)
        {
            p1.guess();
            p2.guess();
            p3.guess();
            if(checkWinner(expectedGuess)==true)
            {
                break;
            }
            else
            {
                System.out.println("Try Again");
            }
        }
    }
    boolean checkWinner(int expectedGuess)
    {
        if(p1.number==expectedGuess)
        {
            System.out.println(p1.name+" wins");
            return true;
        }
        else if(p2.number==expectedGuess)
        {
            System.out.println(p2.name+" wins");
            return true;
        }
        else if(p3.number==expectedGuess)
        {
            System.out.println(p3.name+" wins");
            return true;
        }
        return false;
    }



}

class Player
{
    String name;
    int number;
    Player(String name)
    {
        this.name=name;
    }
    void guess()
    {
        this.number=(int)(Math.random()*10);
        System.out.println(name+" guessed "+number);
    }
}

