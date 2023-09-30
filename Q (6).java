package com.cdac.main;

import java.util.Scanner;

public class TemperatureConverter {
	float Fahrenheit, Celsius;
	
	void ConvertTemp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a choice  for tempertaure :\n"+"  "+"1.celsius to fahrenhit\n"+"  "+"2.fahrenhit to celsius\n");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
		{
			System.out.println("enter the value for Celsius");
			Celsius=sc.nextFloat();	
			Fahrenheit =((Celsius*9)/5)+32; 
		    System.out.println("Celsius to fahrenheit is:"+Fahrenheit);
			
		}
		break;
		
		case 2:
		{
			System.out.println("enter the value for fahrenheit");
			Fahrenheit=sc.nextFloat();
			Celsius = ((Fahrenheit-32)*5)/9;  
		    System.out.println("fahrenheit to celsius is:"+Celsius);
		 
		}
		break;
		default:System.out.println("Kuch bhi mat daal");
		
		}

	    
	    
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TemperatureConverter tc=new TemperatureConverter();
		tc.ConvertTemp();

	}

}
