package kattis;

import java.util.Scanner;

public class Tree {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		char[] path = sc.nextLine().toUpperCase().toCharArray();
		double tot = Math.pow(2, height + 1) - 1;
		
		for (int i = 0; i < path.length; i++) {
			 if (path[i] == 'R') {
				tot = tot - (Math.pow(2, i));
			} else if (path[i] == 'L') {
				tot = tot - (Math.pow(2, i) - 1);
			}
			 System.out.println(tot);
		}
		
		int sol = (int) tot; 
		System.out.println(sol);
		
		sc.close();
	}
	
}
