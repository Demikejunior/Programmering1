package kattis;

import java.util.Scanner;

public class NeedForSpeed {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();
		double t = sc.nextInt();
		double d = 0;

		for (int i = 0; i < n; i++) {
			d += sc.nextInt();
		}
		double tr = (d / t);
		System.out.println(tr);

		sc.close();

	}

}
