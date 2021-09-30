//Ernesto Alonso Gonzalez Olaez
//5.	WAP to count total number of  500,100,50,20 and 10 notes in a given amount
package assignment2BasedOnControlStructure;

import java.util.Scanner;

public class p5_TotalForAmount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        double amount;
		int fiveHundred=0, oneHundred=0,Fifty=0, twenty=0, ten=0 ;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total amount: ");
		amount=s.nextInt();
		while(amount >= 500)
		{
			fiveHundred++;
			amount=amount-500;
		}
		System.out.println("500 notes: "+fiveHundred);
		while(amount >= 100)
		{
			oneHundred++;
			amount=amount-100;
		}
		System.out.println("100 notes: "+oneHundred);
		while(amount >= 50)
		{
			Fifty++;
			amount=amount-100;
		}
		System.out.println("50 notes: "+Fifty);
		while(amount >= 20)
		{
			twenty++;
			amount=amount-100;
		}
		System.out.println("20 notes: "+twenty);
		while(amount >= 10)
		{
			ten++;
			amount=amount-100;
		}
		System.out.println("10 notes: "+twenty);
	}

}
