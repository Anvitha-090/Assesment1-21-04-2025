package assesment_3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		int mynum=number;
		int reversedNum = 0;
		while (number > 0) {
			int digit = number % 10;
			reversedNum = reversedNum * 10 + digit;
			number = number / 10;
		}
		if (reversedNum==mynum) {
			System.out.println("number is Palindrome");
		} else {
			System.out.println("number is not a Palindrome");
		}
	}

}
