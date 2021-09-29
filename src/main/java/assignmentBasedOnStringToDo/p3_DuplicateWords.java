//Ernesto Alonso  Gonzalez Olaez
//WAP to find duplicates words / characters and their occurrence in a string?
package assignmentBasedOnStringToDo;

import java.util.Scanner;
//Ernesto Alonso  Gonzalez Olaez
public class p3_DuplicateWords 
{

	public static void main(String[] args)
	{
		 String str1 = "Hello my name is Ernesto And this is my Country this is And And";  
	        int count;  
	          
	         
	        str1 = str1.toLowerCase();  
	        String words[] = str1.split(" ");  //put the string in a array
	            
	        System.out.println(str1);
	   
	        for(int i = 0; i < words.length; i++)
	        {  
	        	//System.out.print(" "+words[i]);
	            count = 1;  
	            for(int j = i+1; j < words.length; j++)
	            {  
	                if(words[i].equals(words[j])) 
	                {  
	                    count++;  
	                 
	                    words[j] = "0";  //Document my code every time
	                }  
	            }  
	              
	      
	            if(count > 1 && words[i] != "0") 
	            {
	                System.out.println(words[i] +  " "+ count);  
	            }
	        }  
		
	}
		
}
	
	
	


