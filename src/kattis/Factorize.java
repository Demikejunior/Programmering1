package kattis;

import java.util.Scanner;

public class Factorize {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		for (int i = 0; i < r; i++) {
			System.out.println(factor(sc.nextInt()) % 10);
		}
		
		sc.close();
		
	}
	public static int factor(int fac) {
		int sol = 1;
		for (int i = fac; i >= 1; i--) {
			sol *= i;
		}
		return sol;
	}
}
