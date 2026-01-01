<<<<<<< HEAD
package com.index;

import java.util.Scanner;

public class ass1_age {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = obj.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } 
        else if (age < 20) {
            System.out.println("Teenager");
        } 
        else if (age < 60) {
            System.out.println("Adult");
        } 
        else {
            System.out.println("Senior Citizen");
        }

	}

}
=======
package com.index;

import java.util.Scanner;

public class Ass1_age {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = obj.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } 
        else if (age < 20) {
            System.out.println("Teenager");
        } 
        else if (age < 60) {
            System.out.println("Adult");
        } 
        else {
            System.out.println("Senior Citizen");
        }

	}

}

>>>>>>> 4e2be59ddc9ddbcc1590be240181a41b3a00f57a
