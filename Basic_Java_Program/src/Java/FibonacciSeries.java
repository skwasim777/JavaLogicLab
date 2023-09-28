package Java;

import java.util.Scanner;

// fibonacci series is nothing but sum of previous two numbers
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int input = sc.nextInt();
		int n1 = 0, n2 = 1, n3;
		// print n1 and n2
		System.out.print(n1 + " " + n2);
		// run the loop loop will start from 2
		for (int i = 2; i < input; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			sc.close();
		}
	}
}
