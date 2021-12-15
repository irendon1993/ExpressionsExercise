package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score =800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("You Score was under 5000");
//            System.out.println("This was executed");
//        } else if (score < 1000) {
//            System.out.println("your Socore was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
//
//        (gameOver) shortcut for (gameOver == true)
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

//Print out a second score on the screen with the following
//        Score set to 10000
//        levelCompleted set to 8
//        bonus set to 200
//        But make sure the first printout above still displays as well

        boolean newGameOver = true;
        int newScore =10000;
        int newLevelCompleted = 8;
        int newBonus = 100;

        if(newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }



    }
}
