package assigments3BasedOnArraysAndLoops;
//Ernesto Alonso Gonzalez Olaez
//8.	WAP to find the sum of an array elements

public class p8_FindTotalElementsArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		int numbers[]={4,8,1,67,2,6,55,7};  
		int total=0;
		int max=numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			
			total=numbers[i]+total;
		
		}	
		System.out.println("The total of the elements is: "+total);


		
	}

}
