//Ernesto Alonso Gonzalez Olaez
//7.	WAP to sort an array using built in method and display the elements using  foreach  loop.
package assigments3BasedOnArraysAndLoops;
import java.util.Arrays;

public class p7_SortArrayUsingForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,20,10,5,3,2};
		int n=arr.length;
		int temp=0;
		
		for(int m: arr)
		{
			System.out.print(m+ " ");
		}
		
		System.out.println();
		Arrays.sort(arr);
		for(int m: arr)
		{
			System.out.print(m + " ");
			
		}

	}

}
