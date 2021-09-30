//Ernesto Alonso Gonzalez Olaez
//5.	WAP to remove the element on specific index number form an array
package assigments3BasedOnArraysAndLoops;

import java.util.Scanner;



public class p5_RemoveElementOnSpecifyIndex {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		int numbers[]={144,1010,1,67,33,599,55,699};  
		int greater;
		int max=numbers[0];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Insert the index to remove: ");
		int ind=s.nextInt();
		for(int i=0; i<numbers.length; i++)
		{
			
		}
		
		for(int i=0; i<numbers.length; i++)
		{
			if(i==ind)
			{
				numbers[i]=' ';
				
			}
			System.out.print(numbers[i] + " ");
		
		}	
		

		
	}

}
