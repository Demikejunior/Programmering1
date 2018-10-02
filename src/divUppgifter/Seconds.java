package divUppgifter;

import java.util.Scanner;

public class Seconds {
	
	public static void main(String[] args) {
		
		System.out.println("Skriv in timmar, minuter, och sekunder");
		
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt() * 360;
		
		int m = input.nextInt() * 60;
		
		int s = input.nextInt();
		
		input.close();
		
		int sum = h + m + s;
		
		System.out.println(sum);
		
	}
	
}
