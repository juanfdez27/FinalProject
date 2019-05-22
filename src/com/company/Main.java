package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        String rock;
        rock = Integer.toBinaryString(0);
        String paper;
        paper = Integer.toBinaryString(1);
        String scissors;
        scissors = Integer.toBinaryString(2);
        String score;
        System.out.println("Let's play rock, paper, scissors!!");
        System.out.println("If rock type 0, If paper type 1, and If scissors type 2");
        String[] listOfWeapons = new String[3];
        listOfWeapons[0] = "rock";
        listOfWeapons[1] = "paper";
        listOfWeapons[2] = "scissors";
        System.out.println("Select your weapon of choice");
        int chosenWeapon = keyboard.nextInt();
        int computerInput = (int) Math.random();
        double weaponArray = computerInput * 2;
        





        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");


        System.out.println("I picked " + weaponArray + ", you picked " + chosenWeapon + "");


        //case 0 < case 1;
        // case 2 > case 1;


        do {
            if (weaponArray > chosenWeapon) {
                System.out.println("I win");
            }
            if (weaponArray < chosenWeapon) {
                System.out.println("You win");
            }
            if (weaponArray == chosenWeapon) {
                System.out.println("It's a tie");
            }

            weaponArray = keyboard.nextInt();


        } while (weaponArray != chosenWeapon);


    }



    public static String listOfWeapons(int chosenWeapon) {
        switch (chosenWeapon) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "error";
        }
    }

    public static double computerInput(int weaponArray) {
        return weaponArray;



        }

    }








       // }

   // }

   // public static String shoot (int weaponValue ) {
       // case 0 > case 2;
        //case 0 < case 1;
       // case 2 > case 1;
        //return shoot(weaponValue);
//}
    //public static String score

//}
