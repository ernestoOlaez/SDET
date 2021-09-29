//Ernesto Alonso  Gonzalez Olaez
package assignmentBasedOnStringToDo;

import java.util.Arrays;
import java.util.Scanner;

public class p10_RemoveDuplicates 
{
	static void removeDuplicates(char str[], int lenght)
	{
		int pos=0;
		for(int i=0; i<lenght; i++)
		{
			int j;
			for(j=0; j<i; j++)
			{
				if(str[i]==str[j])
				{
					break;
				}
			}
			if(j==i)
			{
				str[pos++]=str[i];
			}
		}
			
		System.out.println(String.valueOf(Arrays.copyOf(str, pos)));   
	}//method
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str1="";
		
		System.out.println("Insert a string: ");
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		char[] ch=str1.toCharArray();
		
		int size=str1.length();
		removeDuplicates(ch,size);

	}

}
