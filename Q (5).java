package com.cdac.main;

import java.util.Scanner;

public class DemoTwo {

	public static void main(String[] args) {
		System.out.println("enter your string:");
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		char a[]=s.toCharArray();
		for(int i=a.length-1; i>=0; i--)
		{
			rev =rev+a[i];
					
		}
		System.out.println(rev);
		
	}
		
		

}






