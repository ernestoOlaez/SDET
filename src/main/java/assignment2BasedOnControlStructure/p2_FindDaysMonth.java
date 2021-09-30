//Ernesto Alonso Gonzalez Olaez
//2.	Write a Java program to find the number of days in a month.
package assignment2BasedOnControlStructure;

import java.util.Scanner;

public class p2_FindDaysMonth {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num, numDays;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Month 1-12: ");
		num=s.nextInt();
		switch(num)
		{
		 case 1:
		 {
			 System.out.println("Januany has: "+31 +" days\n");
		    break;	
		 }
		 case 2:
		 {
			 System.out.println("February has: "+ 28 +" days\n");
		    break;	
		 }
		 case 3:
		 {
			 System.out.println("March has: "+31 +" days\n");
		    break;	
		 }
		 case 4:
		 {
			 System.out.println("April has: "+30 +" days\n");
		    break;	
		 }
		 case 5:
		 {
			 System.out.println("May has: "+31 +" days\n");
		    break;	
		 }
		 case 6:
		 {
			 System.out.println("June has: "+30 +" days\n");
		    break;	
		 }
		 case 7:
		 {
			 System.out.println("July has: "+31 +" days\n");
		    break;	
		 }
		 case 8:
		 {
			 System.out.println("August has: "+31 +" days\n");
		    break;	
		 }
		 case 9:
		 {
			 System.out.println("September has: "+30 +" days\n");
		    break;	
		 }
		 case 10:
		 {
			 System.out.println("October has: "+31 +" days\n");
		    break;	
		 }
		 case 11:
		 {
			 System.out.println("November has: "+30 +" days\n");
		    break;	
		 }
		 case 12:
		 {
			 System.out.println("December has: "+31 +" days\n");
		    break;	
		 }
		 
		}
		
		

	}

}
