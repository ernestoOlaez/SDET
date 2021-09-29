//Ernesto Alonso  Gonzalez Olaez
//WAP to sort string in java without API?
package assignmentBasedOnStringToDo;

public class p6_SortJavaStringWithoutAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="//TODO Auto-generated method stub";
		int j=0;
		char temp=0;
		
		char ch1[]=str1.toCharArray();
		
		for(int i=0; i<ch1.length; i++)
		{
			for(j=0; j<ch1.length; j++)
			{
				if(ch1[j] > ch1[i])
				{
					temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
			}
		}
		
		System.out.println(str1);
		for(int k=0; k<ch1.length; k++) 
		{
		   System.out.print(ch1[k]);	
		}

	}

}
