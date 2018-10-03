package kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {

			int var = input.nextInt();

			int res = 0;

			String[] arr = new String[var];

			for (int j = 0; j <= var; j++) {

				String coke = input.nextLine();

				if (Arrays.asList(arr).contains(coke)) {
					for (int k = 0; k < var; k++) {
						if (arr[k] == null) {
							arr[k] = coke;
							res++;
						}

					}

				} else {

					for (int k = 0; k < var; k++) {
						if (arr[k] == null) {
							arr[k] = coke;
							res++;
						}

					}

				}

			}

			System.out.println(res);

		}

		input.close();

	}

}
