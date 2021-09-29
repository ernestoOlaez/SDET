//Ernesto Alonso  Gonzalez Olaez
//12.WAP to swapping of two strings.Eg: st=”Check”, st1=”code”- o/p : st=code and st1=check
package assignmentBasedOnStringToDo;

import java.util.Scanner;

public class p12_SwappingTwoStrings {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		 String str1, str2, temp;  
		 System.out.println("Insert a string 1:");
		 Scanner s=new Scanner(System.in);
		 str1=s.nextLine();
		 

		 System.out.println("Insert a string 2:");
		 str2=s.nextLine();
		 
		 temp=str1;
		 str1=str2;
		 str2=temp;
		 
		 System.out.println("String 1:"+str1);
		 System.out.println("String 2: "+str2);
		 
		

	}

}
