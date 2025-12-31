package com.index;
import java.util.Scanner;
public class Ass2_read {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Do you want to continue? (y/n)");
            choice = obj.next().charAt(0);

        } while (choice == 'y');

        System.out.println("Stopped");
       
    }
}

