//Ernesto Alonso  Gonzalez Olaez
//WAP to reverse the order of words in a string .He is the one One the is He
package assignmentBasedOnStringToDo;

public class p8_ReverseOrderWords {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		/*
		*
		 char[] ch = new char[str1.length()];
		  
		for(int i=0; i<str1.length(); i++)
		{
			ch[i]=str1.charAt(i);
		}
		System.out.println(str1);
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}*/
		String str1="// TODO Auto-generated method stub";
		 String[] word = str1.split(" ");
	     StringBuilder reverseString = new StringBuilder();
         System.out.println(str1);
         
	     for (int i = word.length - 1; i >= 0; i--)
	     {
	         reverseString.append(word[i]).append(" ");
	     }
	     System.out.println("->" + reverseString);
	   
		

	}

}
