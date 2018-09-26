package kattis;

import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		
		int ballPos = 0;

		char move[] = new char[50];
		
		
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine().toUpperCase();
		
		input.close();
		
		move = str.toCharArray();
		
		
		for (int i = 0; i < move.length ; i++) {
			if (move[i] == 'A'){
				if(ballPos == 0) {
					ballPos = 1;
				} else if(ballPos == 1) {
					ballPos = 0;
				}
			}
			if (move[i] == 'B'){
				if(ballPos == 1) {
					ballPos = 2;
				} else if(ballPos == 2) {
					ballPos = 1;
				}
			}
			if (move[i] == 'C'){
				if(ballPos == 0) {
					ballPos = 2;
				} else if(ballPos == 2) {
					ballPos = 0;
				}
			}
			
			
		}
		System.out.println(ballPos+1);
		
		
	}
	
}
