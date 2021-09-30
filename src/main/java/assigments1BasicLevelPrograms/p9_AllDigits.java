package assigments1BasicLevelPrograms;

import java.util.Scanner;

public class p9_AllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int first = num % 10;
        int r1 = num / 10;
        int second = r1 % 10;
        r1 = r1 / 10;
        int third = r1 % 10;
        r1 = r1 / 10;
        int four = r1 % 10;
        int sum = third + second + first + four;
        System.out.println("The sum of all digits in " + num + " is " + sum);

	}

}
