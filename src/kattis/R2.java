package kattis;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int r1 = input.nextInt();
		int S = input.nextInt();
		
		input.close();
		
		int r2 = S*2-r1;
		
		System.out.println(r2);
		
	}
	
}
