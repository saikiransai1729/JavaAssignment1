package com.cdac.main;

import java.util.Scanner;

public class DemoThree {

	public static void main(String[] args) {
		System.out.println("enter the character:");
		Scanner sc= new Scanner(System.in);
		//aString s=sc.nextLine();
		char chr = sc.next().charAt(0);  
		
int asciivalue1 = chr;


System.out.println("ACII valueof"+chr +asciivalue1);

	}

}
