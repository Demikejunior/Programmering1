package kattis;

import java.util.Scanner;

public class CryptographersConundrum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String Per = "PER";
		int sol = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != Per.charAt(i % 3)) {
				sol++;
			}
		}

		System.out.println(sol);

		sc.close();

	}

}
