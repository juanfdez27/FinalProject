package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        String rock;
        String paper;
        String scissors;
        String shoot;
        int[] rockPaperScissors;
        System.out.println("Let's play rock, paper, scissors!!");
        System.out.println("If rock type 1, If paper type 2, and If scissors type 3");
        System.out.println("Select your weapon of choice");
        int chosenWeapon = keyboard.nextInt();
        rockPaperScissors = new int[chosenWeapon];
        rockPaperScissors = selectedWeapon(rockPaperScissors, keyboard);

        do {
            if (guess < pickedNumber) {
                System.out.println("Nope, too low. Guess again");
            }
            if (guess > pickedNumber) {
                System.out.println("Nope, too high. Guess again");
            }

            guess = keyboard.nextInt();


        }while (guess != pickedNumber);
        
        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");
        shoot = keyboard.nextLine();
        System.out.println("" + shoot + "");




    }

    public static int[] selectedWeapon(int[] weaponArray, Scanner keyboard) {
        for (int i=0; i < weaponArray.length; i++){
            System.out.println("Confirm your weapon");
            weaponArray[0] = keyboard.nextInt();
        }
        return weaponArray;
    }

    public static String weaponNumber(int rockPaperScissors) {
        switch (rockPaperScissors) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "error";
        }

    }

   // public static String shoot (int weaponValue ) {
       // String rock > String scissors;
       // String rock < String paper;
       // String scissors > String paper;
//}

}
