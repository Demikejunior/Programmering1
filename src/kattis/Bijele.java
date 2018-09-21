package kattis;

import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int king = input.nextInt();
		
		int queen = input.nextInt();

		int rook = input.nextInt();

		int bishop = input.nextInt();

		int knight = input.nextInt();

		int pawn = input.nextInt();
		
		input.close();
		
		
		System.out.print((king - 1) * -1 + " ");
		
		System.out.print((queen - 1) * -1 + " ");
		
		System.out.print((rook - 2) * -1 + " ");
		
		System.out.print((bishop - 2) * -1 + " ");
		
		System.out.print((knight - 2) * -1 + " ");
		
		System.out.print((pawn - 8) * -1 + " ");
		
	}
	
}
