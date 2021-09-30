//Ernesto Alonso  Gonzalez Olaez
//Check wheather a number is divisible by 5 and 11
package assignment2BasedOnControlStructure;
import java.util.Scanner;

public class p3_checkNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int num, numDays;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=s.nextInt();
		if((num%5==0)&&(num%11==0))
		{
			System.out.println("Number "+num + " is divisible by 5 and 11. ");
		}
		else
		{
			System.out.println("Number "+num + " is not divisible by 5 and 11. ");
		}

	}

}
