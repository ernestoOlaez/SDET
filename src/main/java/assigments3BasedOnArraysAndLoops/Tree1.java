package assigments3BasedOnArraysAndLoops;

public class Tree1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=5, x=1;
        for(int i=0; i<=n; i++)
        {
        	for(int j=1; j<=5-i; j++)
        	{
        		 System.out.print(" ");
        	}
        	while(x <=(2*i-1))
        	{
        		System.out.print(-Math.abs(x - i) + i);
                x++;
        	}
        	x=1;
        	System.out.println("\n");

        }

	}

}
