package divUppgifter;

import java.util.Scanner;

public class DollaDollaSigns {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int dolla = input.nextInt();

		input.close();
		for (int i = 0; i < dolla; i++) {
			System.out.print("$");
		}
		System.out.println();
		for (int i = 0; i < dolla - 2; i++) {

			System.out.print("$");
			for (int j = 0; j < dolla - 2; j++) {
				System.out.print(" ");
			}
			System.out.print("$");
			System.out.println();

		}
		if (dolla != 1) {
			for (int i = 0; i < dolla; i++) {
				System.out.print("$");
			}

		}

	}

}
