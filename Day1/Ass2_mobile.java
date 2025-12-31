package com.index;
import java.util.Scanner;
public class ass2_mobile {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String mobile;

        do {
            System.out.println("Enter 10-digit mobile number:");
            mobile = obj.nextLine();

        } while (mobile.length() != 10);

        System.out.println("Valid mobile number");
      
    }
}
