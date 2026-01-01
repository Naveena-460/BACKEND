package com.index;
import java.util.Scanner;

public class ass2_atm {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int pin = 1234;
        int enteredPin = 0;

        while (enteredPin != pin) {
            System.out.println("Enter PIN:");
            enteredPin = obj.nextInt();
        }

        System.out.println("PIN correct. Access granted");
       
    }
}
