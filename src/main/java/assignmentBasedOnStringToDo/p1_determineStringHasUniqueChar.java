//Ernesto Alonso  Gonzalez Olaez
//WAP to determine whether a string has unique characters or not.? Ex. i/p java – o/p false
package assignmentBasedOnStringToDo;

public class p1_determineStringHasUniqueChar
{
	
	public static boolean Validation(String str1)
	{
		for(int i=0;  i<str1.length(); i++)
		{
			char ch=str1.charAt(i);
			int count=0;
			for(int j=i; j< str1.length(); j++)
			{
				if(ch==str1.charAt(j))
				{
					count++;
				}
			}
			if(count >1)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str2="Helo";
		boolean result=false;
		System.out.println("String:  "+ str2+ " " + Validation(str2));
	}

}
