package kattis;

import java.util.Scanner;

public class Everywhere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {

			int var = input.nextInt();

			String trash = input.nextLine();

			int res = 0;

			String[] arr = new String[var];

			for (int j = 0; j < var; j++) {

				String coke = input.nextLine();

				for (int index = 0; index < var; index++) {

					if (index != var + 1) {
						try {
							if (arr[index].equals(coke)) {
								break;
							}
						} catch (NullPointerException e) {
							arr[index] = coke;
							res++;
							break;
						}
					}

				}

			}

			System.out.println(res);

		}

		input.close();

	}

}
