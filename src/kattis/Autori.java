package kattis;

import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("-");
		String sol = "";
		for (int i = 0; i < str.length; i++) {
			sol += str[i].charAt(0);
		}
		System.out.println(sol);
		
		sc.close();

	}

}
