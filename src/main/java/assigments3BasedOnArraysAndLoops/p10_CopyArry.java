//Ernesto Alonso Gonzalez Olaez
//10.	WAP to copy an array elements into new array and print the new array values
package assigments3BasedOnArraysAndLoops;

public class p10_CopyArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]={144,1010,1,67,33,599,55,699};
		int n=arr1.length;
		int arr2[]=new int[n];
	   int k=0;
				
		
		System.out.println("The total size for Array is: "+ n);
		for(int i=0; i<=arr1.length-1; i++)
		{
			arr2[k]=arr1[i];
		    k++;
					
		}
		
		for(int j=0; j<=arr1.length-1; j++)
		{
			System.out.print(arr2[j] + " ");
		}
		

	}

}
