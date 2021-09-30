
//Ernesto Alonso Gonzalez Olaez
//1.	WAP to Sort an array Elements  and then segregate the even and odd elements of an array
package assigments3BasedOnArraysAndLoops;

public class p1_SortingDemoEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={20,10,5,3,2};
		int n=arr.length;
		int temp=0;
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int m: arr)
		{
			
			if(m%2==0)
			{
			 System.out.print(" even ");
			}
			else
			{
				 System.out.print(" odd ");
			}
			System.out.println(m);
			
		}

	}

}
