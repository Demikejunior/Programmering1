package kattis;

import java.util.Scanner;

public class datum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day = input.nextInt();
		
		int month = input.nextInt();
		
		input.close();
		
		int var = -1;
		
		if (month > 0) {
			var = var + day;
		}
		
		if (month > 1) {
			var = var + 31;
		}
		
		if (month > 2) {
			var = var + 28;
		}
		
		if (month > 3) {
			var = var + 31;
		}
		
		if (month > 4) {
			var = var + 30;
		}
		
		if (month > 5) {
			var = var + 31;
		}
		
		if (month > 6) {
			var = var + 30;
		}
		
		if (month > 7) {
			var = var + 31;
		}
		
		if (month > 8) {
			var = var + 31;
		}
		
		if (month > 9) {
			var = var + 30;
		}
		
		if (month > 10) {
			var = var + 31;
		}
		
		if (month > 11) {
			var = var + 30;
		}
		
		if (month > 12) {
			System.out.println("NULL");
		}
		
		if (day > 31) {
			System.out.println("NULL"); 
		}
		
		var = var % 7;
		
		if (var == 0) {
			System.out.println("Thursday");
		} else if (var == 1) {
			System.out.println("Friday");
		} else if (var == 2) {
			System.out.println("Saturday");
		} else if (var == 3) {
			System.out.println("Sunday");
		} else if (var == 4) {
			System.out.println("Monday");
		} else if (var == 5) {
			System.out.println("Tuesday");
		} else if (var == 6) {
			System.out.println("Wednesday");
		} else if (var >= 7) {
			System.out.println("NULL");
		}
		
	}
	
}
