package kattis;
import java.util.Scanner;

public class Spells {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int var = input.nextInt();
		
		for (int i = 1; i <= var; i++) {
			System.out.println(i + " Abracadabra");
		}
		
		input.close();
		
	}
	
}
