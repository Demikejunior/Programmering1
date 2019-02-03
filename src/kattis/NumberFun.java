package kattis;

import java.util.Scanner;

public class NumberFun {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			boolean sol = false;
			
			if (a + b == c) {
				sol = true;
			} else if (a - b == c) {
				sol = true;
			} else if (a * b == c) {
				sol = true;
			} else if (a / b == c) {
				sol = true;
			} else if (b - a == c) {
				sol = true;
			} else if (b / a == c) {
				sol = true;
			} if (sol) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
			
		}
		
		sc.close();
		
	}
	
}
