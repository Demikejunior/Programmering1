package kattis;

import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int hour = input.nextInt();
		int min= input.nextInt();
		
		if (hour - 1 < 0) {
			hour = hour + 24;
		}
		if (min - 45 < 0) {
			hour = hour - 1;
			min = min + 15;
		}else {
			min = min - 45;
		}
		
		input.close();
		
		System.out.println(hour + " " + min);
		
	}
	
}
