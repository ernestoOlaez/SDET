//Ernesto Alonso  Gonzalez Olaez
//WAP to count the vowels and consonants in a string
package assignmentBasedOnStringToDo;

import java.util.Scanner;

public class p9_CountVowelsAndCons {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int vCount=0,cCount=0;
		String str1;
		
		System.out.println("Insert a string: ");
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		System.out.println(str1);
		
		str1=str1.toLowerCase();
		
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i)=='a' ||str1.charAt(i)=='e'|| str1.charAt(i)=='i'|| str1.charAt(i)=='o'|| str1.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str1.charAt(i)>'a' && str1.charAt(i)<='z')
			{
				cCount++;
			}
		}//
		

		System.out.println("Number of vowels: "+ vCount);
		System.out.println("Number of consonantes: "+ cCount);
		

	}

}
