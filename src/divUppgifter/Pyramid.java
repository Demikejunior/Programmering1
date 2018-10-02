package divUppgifter;

import java.util.Scanner;

public class Pyramid {
	
	public static void main(String[] args) {
		
		System.out.println("Hur stor bas ska pyramiden ha?");
		
		Scanner input = new Scanner(System.in);
		
		int bas = input.nextInt();
		
		input.close();
		
		for (int i = 0; i <= bas; i++) {
			for (int j = bas; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("x ");
			}
			
			System.out.println();
			
			
		}
		
	}
	
}
