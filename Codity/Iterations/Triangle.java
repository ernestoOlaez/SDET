package Iterations;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int x;
		System.out.println("Insert a number of levels for the triangle:");
	    Scanner scanner = new Scanner(System.in);
	    x = scanner.nextInt();
	    for(int i=1; i<=x; i++)
	    {
	    	for(int j=1; j<=i; j++)
	    	{
	    		System.out.print("  *");
	    	}
	    	System.out.println(" \n");
	    }

	}

}
