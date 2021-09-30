//Ernesto Alonso Gonzalez Olaez
//4.	WAP  to enter the days of week and print name of  day-- switch case, Ladderif
package assignment2BasedOnControlStructure;

import java.util.Scanner;

public class p4_DaysWeek {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          int num, numDays;
          String Day = null;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Day 1-7: ");
		num=s.nextInt();
		switch(num)
		{
		 case 1:
		 {
	        Day="Monday";
		    break;	
		 }
		 case 2:
		 {
			 Day="Tuesday";
		    break;	
		 }
		 case 3:
		 {
			 Day="Wednesday";
		    break;	
		 }
		 case 4:
		 {
			 Day="Thursday";
		    break;	
		 }
		 case 5:
		 {
			 Day="Friday";
		    break;	
		 }
		 case 6:
		 {
			 Day="Saturday";
		    break;	
		 }
		 case 7:
		 {
			 Day="Sunday";
		    break;	
		 }
		
		}	
		 System.out.println("Day selected is: "+ Day);
	}

}
