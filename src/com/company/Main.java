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
        System.out.println("Let's play rock, paper, scissors!!");
        System.out.println("If rock type 0, If paper type 1, and If scissors type 2");
        String[] listOfWeapons = new String[3];
        listOfWeapons[0] = "rock";
        listOfWeapons[1] = "paper";
        listOfWeapons[2] = "scissors";
        System.out.println("Select your weapon of choice");
        int chosenWeapon = keyboard.nextInt();
        //rockPaperScissors = new String(listOfWeapons);
       // rockPaperScissors = chosenWeapon(rockPaperScissors, keyboard);


        String weaponArray;
        weaponArray = keyboard.nextLine();

        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");

        // weaponArray = keyboard.nextLine();
        // System.out.println("" + weaponArray + "");


      //  do {
           // if (weaponArray > chosenWeapon) {
           //     System.out.println("I win");
           // }
          ///  if (weaponArray < chosenWeapon) {
          //      System.out.println("You win");
          //  }
          //  if (weaponArray == chosenWeapon) {
          //      System.out.println("It's a tie");
          //  }

          //  weaponArray = keyboard.nextInt();


      //  } while (weaponArray != chosenWeapon);


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

}







       // }

   // }

   // public static String shoot (int weaponValue ) {
        //case 1 > case 3;
        //case 1 < case 2;
       // case 3 > case 2;
        //return shoot(weaponValue);
//}
    //public static String score

//}
