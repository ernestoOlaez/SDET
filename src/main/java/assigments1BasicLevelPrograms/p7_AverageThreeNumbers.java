//Ernesto Alonso  Gonzalez Olaez
// 7.	Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package assigments1BasicLevelPrograms;

import java.util.Scanner;

public class p7_AverageThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3, avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Insert Number 1: ");
		n1=s.nextFloat();
		System.out.println("Insert Number 2: ");
		n2=s.nextFloat();
		System.out.println("Insert Number 3: ");
		n3=s.nextFloat();
		avg=(n1+n2+n3)/3;
		System.out.println("The average og the three numbers is: "+ avg);
		

	}

}
