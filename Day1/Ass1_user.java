package com.index;

import java.util.Scanner;

public class Ass1_user {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); 

        System.out.println("Enter username:");
        String username = obj.nextLine();

        System.out.println("Enter password:");
        String password = obj.nextLine();

        if (username.equals("navee") && password.equals("1234")) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Invalid Credentials");
        }

        
    }
}

