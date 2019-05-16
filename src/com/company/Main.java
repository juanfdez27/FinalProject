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
        int chosenWeapon = keyboard.nextInt();
        rockPaperScissors = new int[chosenWeapon];

        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");
        shoot = keyboard.nextLine();
        System.out.println("" + shoot + "");




    }

    public static int[] inputWeapon(int[] weaponArray, Scanner keyboard) {
        for (int i=0; i = weaponArray.length; i++){
            System.out.println("Select a weapon");
            weaponArray[i] = keyboard.nextInt();
        }
        return weaponArray;
    }

    public static String weaponNumber(int chosenWeapon) {
        switch (chosenWeapon) {
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
