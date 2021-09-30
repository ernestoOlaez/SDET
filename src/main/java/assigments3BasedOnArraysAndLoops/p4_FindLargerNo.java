package assigments3BasedOnArraysAndLoops;
//Ernesto Alonso Gonzalez Olaez
//4.	WAP to find the index number of largest element

public class p4_FindLargerNo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		int numbers[]={144,1010,1,67,33,599,5555,699};  
		int greater;
		int pos=0;
		int max=numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
				pos=i;
				
				
			}
		
		}	
		System.out.println("Greates position: "+pos);


		
	}

}
