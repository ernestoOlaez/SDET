//Ernesto Alonso Gonzalez Olaez
//6.	Write a Java program to compare two numbers.
package assignment2BasedOnControlStructure;

import java.util.Scanner;

public class p6_CompareTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1=0, num2=0 ;
   
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		 num1=s.nextInt();
		 
	
		System.out.println("Enter number 2: ");
		num2=s.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Number "+num1 + " is greather than  "+ num2);
		}
		else if(num1<num2)
		{
			System.out.println("Number "+num1 + " is lower than  "+ num2);
		}
		else if(num1==num2)
		{
			System.out.println("Numberr "+num1 + " is equals than  "+ num2);
		}
		else
		{
			System.out.println("There are no numbers...  "+ num2);
		}
		
	}

}
