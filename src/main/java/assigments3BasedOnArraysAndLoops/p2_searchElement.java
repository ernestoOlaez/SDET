// Ernesto Alonso Gonzalez Olaez
//2. WAP to Search an Element from an array
package assigments3BasedOnArraysAndLoops;

import java.util.Scanner;

public class p2_searchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int search=0;
		boolean  found=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		search=s.nextInt();
		
		int numbers[]={144,1010,1,67,33,599,55,699};  
		int greater;
		int min=numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==search)
			{
				found=true;
				
			}
			
		
		}	
		if(found==true)
		{
			System.out.println("Number was found in the array ");
		}
		else
		{
			System.out.println("Number was not found in the array ");
		}
			
			



	}

}
