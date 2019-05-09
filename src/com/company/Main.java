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
        System.out.println("Let's play rock, paper, scissors!!");
        System.out.println("Rock...");
        System.out.println("Paper...");
        System.out.println("Scissors...");
        System.out.println("SHOOT!");
        shoot = keyboard.nextLine();
        System.out.println(""+shoot+"");



    }
}
