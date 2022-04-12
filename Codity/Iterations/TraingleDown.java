package Iterations;

import java.util.Scanner;

public class TraingleDown {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x;
		System.out.println("Insert a number of levels for the triangle:");
	    Scanner scanner = new Scanner(System.in);
	    x = scanner.nextInt();
	    for(int i=x; i>0; i--)
	    {
	    
		  for(int j=1; j<x-i; j++)
		  {
			
			  System.out.print(" ");
		  }
		  for(int k=0; k<2*i-1; k++)
		  {
			
			System.out.print("*");  
		  }
		 
		  System.out.println(""); 
	    }
	}

}

