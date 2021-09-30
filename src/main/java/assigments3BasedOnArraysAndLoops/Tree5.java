package assigments3BasedOnArraysAndLoops;

public class Tree5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 5/2 + 1;
         
	        for(int i=1; i<=n;i++){
	       
	            for(int j=1;j<=n-i;j++){
	                System.out.print(" ");
	            }
	  
	            for(int k=1;k<=(2*i)-1;k++){
	                System.out.print(k);
	            }
	            System.out.println("");         
	        }
	         
	        n--;
	         
	        for(int i=1;i<=n;i++){
	      
	            for(int j=1;j<=i;j++){
	                System.out.print(" ");
	            }
	   
	            for(int k=1;k<=(n-i)*2 +1;k++){
	                System.out.print(k);
	            }
	            System.out.println();
	        }

	}

}
