package kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Akcija {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] c = new int[N];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		int sol = 0;
		int ba = 0;
		for (int i = c.length - 1; i >= 0; i--) {
			if (ba != 2) {
				sol += c[i];
				ba++;
			} else {
				ba = 0;
			}
		}
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
