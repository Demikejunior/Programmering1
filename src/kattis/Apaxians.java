package kattis;

import java.util.Scanner;

public class Apaxians {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String sol = str.charAt(0) + "";
		int place = 0;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != sol.charAt(place)) {
				sol += str.charAt(i);
				place++;
			}
		}
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
