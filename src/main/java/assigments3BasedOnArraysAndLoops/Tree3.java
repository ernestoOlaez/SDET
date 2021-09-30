package assigments3BasedOnArraysAndLoops;

public class Tree3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int i, j,n=5;
		 
	        // outer loop to handle number of rows
	        //  n in this case
	        for(i=0; i<n; i++)
	        {
	 
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop   
	            for(j=0; j<=i; j++)
	            {
	                // printing stars
	                System.out.print("* \t");
	            }
	 
	            // ending line after each row
	            System.out.println();
	        }
		
		

		

	}

}
