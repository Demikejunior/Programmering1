package divUppgifter;

import java.util.Scanner;

public class Multiplikation {
	public static void main(String[] args) {

		boolean exit = false;
		
		Scanner input = new Scanner(System.in);
		
		int var = 1;
		int count = 0;
		
		while (!exit) {
			
			if (var >= 100000 || count >= 10) {
				exit = true;
			} else {
			
			int var1 = input.nextInt();
			
			var = var * var1;
			
			count++;
			}
		}
		
		input.close();
		
		System.out.println(var);
		
	}

}
