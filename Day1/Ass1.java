package com.index;

import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		
System.out.println("Enter mark:");
Scanner obj =new Scanner(System.in);
int marks=obj.nextInt();

if(marks>=40)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}


