<<<<<<< HEAD
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
=======
package com.index;
import java.util.Scanner;
public class Ass1_pass {

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

>>>>>>> 4e2be59ddc9ddbcc1590be240181a41b3a00f57a
