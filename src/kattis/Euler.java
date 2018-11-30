package kattis;

import java.util.Scanner;

public class Euler {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		double sum = 0;
		
		for (int i = 0; i <= n; i++) {
			double temp = factorial(i);
			sum += 1/temp;
		}
		
		System.out.println(sum);
		
	}
	
	private static double factorial(int f) {
		int var = 1;
		for (int i = f; i > 0; i--) {
			var = var * i;
		}
		return var;
	}
	
}
