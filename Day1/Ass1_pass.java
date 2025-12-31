package com.index;
import java.util.Scanner;
public class ass1_pass {

	public static void main(String[] args) {
		

        System.out.println("Enter password:");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak password");
        } else {
            System.out.println("Strong password");
        }
	}

}
