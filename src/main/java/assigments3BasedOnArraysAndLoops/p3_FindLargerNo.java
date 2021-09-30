//Ernesto Alonso Gonzalez Olaez
//3.	WAP to find the largest and smallest  element of and array
package assigments3BasedOnArraysAndLoops;


public class p3_FindLargerNo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		int numbers[]={144,1010,1,67,33,599,55,699};  
		int greater;
		int max=numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
				
			}
		
		}	
		System.out.println("Greates: "+max);
	
		int min=numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]<min)
			{
				min=numbers[i];
				
			}
		
		}	
		System.out.println("Smaller: "+min);


		
	}

}
