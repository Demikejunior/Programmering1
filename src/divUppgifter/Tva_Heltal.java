package divUppgifter;

import java.util.Scanner;

public class Tva_Heltal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int var1 = input.nextInt();
		
		int var2 = input.nextInt();
		
		input.close();
		
		if (var1 < var2) {
			System.out.println(var1);
		} else if (var1 > var2) {
			System.out.println(var2);
		} else {
			System.out.println("De är samma");
		}
		
	}
	
}
