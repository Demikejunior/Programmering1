package kattis;

import java.util.Scanner;

public class Tarifa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int N = sc.nextInt();
		int sol = x;
		
		for (int i = 0; i < N; i++) {
			
			int p = sc.nextInt();
			
			sol += x - p;
			
		}
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
