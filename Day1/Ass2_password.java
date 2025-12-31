package com.index;

import java.util.Scanner;

public class Ass2_password {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String password = "";

        while (password.length() < 8) {
            System.out.println("Enter password:");
            password = obj.nextLine();

            if (password.length() < 8) {
                System.out.println("Password too short");
            }
        }

        System.out.println("Password accepted");

    }
}

