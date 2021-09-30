package homeActivities;

import java.util.Scanner;

public class RegistrationStudentsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] regNo=new int[5];
		String[] name=new String[5];
		int[] notes=new int[5];
		int[] English=new int[5];
		int[] Sciences=new int[5];
		int[] Math=new int[5];
		int[] total=new int[5];
		int[] avg=new int[5];
		
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);

		int k=1,op;
		for(int i=0; i<5; i++)
		{	
			op=0;
			System.out.println("Enter the reg No: " +" student "+ k);
			regNo[i]=s.nextInt();
			
			System.out.println("Enter the name: ");
			name[i]=s1.nextLine();
			
			System.out.println("Enter score for English: ");
			English[i]=s.nextInt();
			
			System.out.println("Enter score for Sciences: ");
			Sciences[i]=s.nextInt();
			
			System.out.println("Enter score for Math: ");
			Math[i]=s.nextInt();
			
			total[i]=English[i]+Sciences[i]+Math[i];
			op=(total[i])/3;
			
			avg[i]=op;
			k++;
			
		
		}	
		
		System.out.println("Reg. No."+"\t" +"Name"+"\t\t"+"English"+"\t\t"+"Sciences"+"\t\t"+"Math"+"\t\t"+"Total"+"\t\t"+"Avg" );
		for(int i=0; i<5; i++)
		{
		   System.out.println(regNo[i]+"\t\t" +name[i] +"\t\t"+English[i]+"\t\t"+Sciences[i] +"\t\t"+Math[i]+"\t\t"+total[i]+"\t\t"+avg[i]);
		
		}	
		

	}

}
