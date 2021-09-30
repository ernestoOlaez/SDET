//Ernesto Alonso Gonzalez Olaez
//7.	WAP to check whether a number is even or odd.

package assignment2BasedOnControlStructure;

import java.util.Scanner;

public class p7_EverOrodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num, numDays;
     
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check: ");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("Enter number "+ num + " is  even. ");
		}
		else
		{
			System.out.println("Enter number " + num + "is odd. ");
		}

	}

}
