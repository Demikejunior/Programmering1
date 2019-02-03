package kattis;

import java.util.Scanner;

public class Apaxians {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String sol = str.charAt(0) + "";

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != sol.charAt(i - 1)) {
				sol += str.charAt(i);
			}
		}

		System.out.println(sol);

		sc.close();

	}

}
