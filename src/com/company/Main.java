package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        String rock;
        String paper;
        String scissors;
        String score;
        int[] rockPaperScissors;
        System.out.println("Let's play rock, paper, scissors!!");
        System.out.println("If rock type 1, If paper type 2, and If scissors type 3");
        System.out.println("Select your weapon of choice");
        int chosenWeapon = keyboard.nextInt();
        rockPaperScissors = new int[chosenWeapon];
        rockPaperScissors = selectedWeapon(rockPaperScissors, keyboard);
        int weaponArray;
        weaponArray = keyboard.nextInt();



        do {
            if (chosenWeapon > chosenWeapon) {
                System.out.println("I win");
            }
            if (chosenWeapon < chosenWeapon) {
                System.out.println("You win");
            }
            if (chosenWeapon == chosenWeapon){
                System.out.println("It's a tie");
            }

            weaponArray = keyboard.nextInt();


        }while (chosenWeapon != chosenWeapon );

        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");
        weaponArray = keyboard.nextInt();
        System.out.println("" + weaponArray + "");





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

    public static String shoot (int weaponValue ) {
        //case 1 > case 3;
        //case 1 < case 2;
       // case 3 > case 2;
        return shoot(weaponValue);
}
    //public static String score

}
