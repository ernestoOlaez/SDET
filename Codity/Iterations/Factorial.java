package Iterations;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x;
		System.out.println("Insert a number to calculate the Factorial:");
	    Scanner scanner = new Scanner(System.in);
	    x = scanner.nextInt();
	    long fact=1;
	    for(int i=1; i<=x; i++)
	    {
	    	fact=fact*i;
	    }
	    System.out.println("Factorial of: "+ x  +" is: " + fact);

	}

}
