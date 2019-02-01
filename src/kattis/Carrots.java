package kattis;

import java.util.Scanner;

public class Carrots {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sol = 0;
		
		for (int i = 0; i < 2; i++) {
			sol = sc.nextInt();
		}
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
