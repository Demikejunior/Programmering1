package kattis;

import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		
		int var = 0;
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[42];
		
		for (int i = 0; i < 10; i++) {
			int num = input.nextInt() % 42;
			arr[num]++;
		}
		
		input.close();
		
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			if (a > 0) {
				var++;
			}
		}
		
		System.out.println(var);


	}

}
