package assigments3BasedOnArraysAndLoops;
//Ernesto Alonso Gonzalez Olaez
//6.	WAP to find the second largest number  of an array.

public class p6_FindSecondLargerNoArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		int numbers[]={144,1010,1,67,5000,599,55,699,33};  
		int max=numbers[1];
		int old=0;
		int temp=0;
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=1; j<numbers.length-i; j++)
			{
				if(numbers[j-1]>numbers[j])
				{
					temp=numbers[j-1];
					numbers[j-1]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		
		for(int i=numbers.length-2; i<=numbers.length-2; i++)
		{
			
			System.out.print( numbers[i]+" ");
			
		}


		
	}

}
