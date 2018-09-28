package divUppgifter;

import java.util.Scanner;

public class Siffersumma {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int var = input.nextInt();
		
		input.close();
		
		int length = String.valueOf(var).length();
		
		double sol = 0;
		
		double var1 = 0;
		
		for(int i = 1; i <= length; i++) {
			
			int var2 = (int) ((var % Math.pow(10, (i-1))));
			
			var1 = ((var % Math.pow(10, i)) - var2) / Math.pow(10, i-1);
			
			sol = sol + var1;
			
			System.out.println("sol är " + sol + ". Medan var1 är " + var1);
			
		}
		
		System.out.println(sol);
		
	}
	
}
