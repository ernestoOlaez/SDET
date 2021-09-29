//Ernesto Alonso  Gonzalez Olaez
//WAP to remove duplicate characters?
package assignmentBasedOnStringToDo;

import java.util.Arrays;
import java.util.Scanner;

public class P11_SortWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str1;
		  Scanner s = new Scanner(System.in);
	      System.out.println("Enter a string: ");
	      str1 = s.nextLine();
	      str1=str1.toLowerCase();
	      char charArray[] = str1.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
		 
	}

}
