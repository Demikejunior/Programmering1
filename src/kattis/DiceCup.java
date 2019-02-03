package kattis;

import java.util.Scanner;

public class DiceCup {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		
		if (d1 == d2) {
			System.out.println(d1 + 1);
		} else if (d1 < d2) {
			for (int i = d1 + 1; i <= d2 + 1; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = d2 + 1; i <= d1 + 1; i++) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
	
}
