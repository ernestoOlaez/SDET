//Ernesto Alonso  Gonzalez Olaez
// 8.	Write a Java program to print the area and perimeter of a rectangle.
package assigments1BasicLevelPrograms;

import java.util.Scanner;

public class p8_AreaAndPermiterRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float w,h,a, p;
		Scanner s=new Scanner(System.in);
		System.out.println("Insert width: ");
		w=s.nextFloat();
		System.out.println("Insert height: ");
		h=s.nextFloat();
		p=(2*w)+(2*h);
		System.out.println("The perimeter is: " + p);
		a=h*w;
		System.out.println("The area is: "+ a);

	}

}
