//Ernesto Alonso Gonzalez Olaez
//1.	Write a Program to check  whether  number is positive or negative number.
package assignment2BasedOnControlStructure;

import java.util.Scanner;

public class p1_NumerPositiveOrNegative {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		int num1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of num1: ");
		num1=s.nextInt();
		if(num1 > 0)
		{
			System.out.println("The number: "+num1 + "is positive");
		}
		else
		{
			System.out.println("The number: "+num1 + " is negative");
		}

	}

}
