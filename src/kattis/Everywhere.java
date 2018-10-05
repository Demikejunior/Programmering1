package kattis;

import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // skap

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {

			int var = input.nextInt();

			System.out.println(input.nextLine());

			int res = 0;

			String[] arr = new String[var-1];

			for (int j = 0; j <= var; j++) {

				String coke = input.nextLine();

				for (int k = 0; k < var; k++) {

					if (arr[k].equals(null)) {
						arr[k] = coke;
						res++;
						System.out.println(coke);
						
					}

				}

			}

			System.out.println(res);

		}

		input.close();

	}

}
