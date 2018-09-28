package kattis;

import java.util.Scanner;

public class Sum_and_Median {

	public static void main(String[] args) {

		boolean exit = false;

		System.out.println("Skriv in nummer");

		double sum = 0;

		Scanner input = new Scanner(System.in);

		int i = 0;

		while (!exit) {
			int tal1 = input.nextInt();

			if (tal1 == 0) {
				exit = true;
			}

			sum = tal1 + sum;

			i++;

		}
		
		input.close();
		
		System.out.println("Medel är: " + sum / i);

		System.out.println("Summan är: " + sum);

	}

}
