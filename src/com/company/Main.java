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
        int [] rockPaperScissors;
        System.out.println("Let's play rock, paper, scissors!!");
        int chosenWeapon = keyboard.nextInt();
        rockPaperScissors = new int[chosenWeapon];

        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");
        shoot = keyboard.nextLine();
        System.out.println(""+shoot+"");

        do {
            if (shoot < pickedNumber) {
                System.out.println("Nope, too low. Guess again");
            }
            if (shoot > pickedNumber) {
                System.out.println("Nope, too high. Guess again");
            }

            shoot = keyboard.nextLine();


        }while (shoot != pickedNumber);




        if (shoot == pickedNumber){
            System.out.println("CORRECT!!! You guessed it!");
        }



    }
    public static int[]inputWeapon (int[] weaponArray, Scanner keyboard){
           for (int inputWeapon;) {
               System.out.println("Select a weapon");
               weaponArray[2] = keyboard.nextInt();
           }
           return weaponArray;
    }
    public static String printMonth (int month){
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
}
