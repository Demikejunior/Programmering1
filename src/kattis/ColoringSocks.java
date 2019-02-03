package kattis;

import java.util.Arrays;
import java.util.Scanner;

public class ColoringSocks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Socks = sc.nextInt();
		int Cap = sc.nextInt();
		int K = sc.nextInt();

		int D[] = new int[Socks];
		int buys = 1;
		for (int i = 0; i < D.length; i++) {
			D[i] = sc.nextInt();
		}
		Arrays.sort(D);

		int piv = 0;

		if (Cap == 1) {

			buys = Socks;

		} else {
			for (int i = 1; i < Socks; i++) {

				if (i - piv < Cap) {
					if (D[i] <= D[piv] + K) {
					} else if (D[i] > D[piv] + K) {
						buys++;
						piv = i;
					}
				} else {
					buys++;
					piv = i;
				}

			}
		}

		System.out.println(buys);

		sc.close();

	}

}
