package com.company;

import java.util.Scanner;

public class Main {

    private static Object Keyboard;

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        num = keyboard.nextInt();
        total += num;
        // Loop should end here
while (num!=10) {
    System.out.println("The total of all 10 numbers is " + total);

    num = keyboard.nextInt();
}
    }
}
