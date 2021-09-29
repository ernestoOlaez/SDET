//Ernesto Alonso  Gonzalez Olaez
//Whether strings are anagram or not?
package assignmentBasedOnStringToDo;

import java.util.Arrays;
import java.util.Scanner;

public class p2_StringIsAnagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1, str2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String 1: ");
		str1=s.next();
		System.out.println("Enter String 2: ");
		str2=s.next();
		ValidationAnagram(str1,str2);
		
	}
	
	public static void ValidationAnagram(String s1, String s2)
	{
		String cad1 = s1.replaceAll("\\s", "");  
        String cade2 = s2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length())
        {  
            status = false;  
        } 
        else 
        {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status)
        {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } 
        else 
        {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
	}

}
