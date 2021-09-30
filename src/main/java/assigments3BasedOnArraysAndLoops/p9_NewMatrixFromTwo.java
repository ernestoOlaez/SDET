//Ernesto Alonso Gonzalez Olaez
//9.	WAP to add the two matrices.

package assigments3BasedOnArraysAndLoops;
import java.util.Arrays;
public class p9_NewMatrixFromTwo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr1[]={144,1010,1,67,33,599,55,699};
		int arr2[]={7,10,1,444,90,4,470,78};
		int l1=arr1.length;
		int l2=arr2.length;
		int size=l1+l2;
	    int[] arr3 = new int[size];
	    
	    for (int i = 0; i < arr1.length; i++)
	    {
	    	arr3[i] = arr1[i];
        }
  
        for (int i = 0; i < arr2.length; i++)
        {
            arr3[l1 + i] = arr2[i];
        }
  
        System.out.print("{");
        for (int i = 0; i < arr3.length; i++)
        {
            System.out.print(arr3[i]+" ");
        }
		System.out.println("}");
		
		Arrays.sort(arr3);
		System.out.print("{");
		for(int m: arr3)
		{
			System.out.print(m + " ");
			
		}
		System.out.println("}");
		
	}

}
