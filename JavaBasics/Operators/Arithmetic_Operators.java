package Operators;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b = 10, c = 5;
		a = b + c;
		System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		a = b - c;
		System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		a = b * c;
		System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		a = b / c;
		System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		a = b % c;
		System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		b++;
		System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		c--;
		System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);

	}

}
