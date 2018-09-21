package kattis;
import java.util.Scanner;

public class twoStones {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int var = input.nextInt();
		if (var % 2 == 0) {
			System.out.println("Bob");
		} else {
			System.out.println("Alice");
		}
		
		input.close();
		
	}
	
}
