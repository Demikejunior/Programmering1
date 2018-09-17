import java.util.Scanner;

public class Villkor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in 10 heltal: ");
		
		int tal0 = input.nextInt();
		
		int min = tal0;
		int max = tal0;
		
		int tal1 = input.nextInt();

		if(tal1 > max) {
			max = tal1;
		}
		else if(tal1 < min) {
			min = tal1;
		}
		
		int tal2 = input.nextInt();

		if(tal2 > max) {
			max = tal2;
		}
		else if(tal2 < min) {
			min = tal2;
		}
		
		int tal3 = input.nextInt();

		if(tal3 > max) {
			max = tal3;
		}
		else if(tal3 < min) {
			min = tal3;
		}
		
		int tal4 = input.nextInt();

		if(tal4 > max) {
			max = tal4;
		}
		else if(tal4 < min) {
			min = tal4;
		}
		
		int tal5 = input.nextInt();

		if(tal5 > max) {
			max = tal5;
		}
		else if(tal5 < min) {
			min = tal5;
		}
		
		int tal6 = input.nextInt();

		if(tal6 > max) {
			max = tal6;
		}
		else if(tal6 < min) {
			min = tal6;
		}
		
		int tal7 = input.nextInt();

		if(tal7 > max) {
			max = tal7;
		}
		else if(tal7 < min) {
			min = tal7;
		}
		
		int tal8 = input.nextInt();

		if(tal8 > max) {
			max = tal8;
		}
		else if(tal8 < min) {
			min = tal8;
		}
		
		int tal9 = input.nextInt();

		if(tal9 > max) {
			max = tal9;
		}
		else if(tal9 < min) {
			min = tal9;
		}
		
		
		input.close();
		
		

		double medel = (tal0 + tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9)/10;
		
		System.out.println(max + " är störst.");
		
		System.out.println(min + " är minst.");
		
		System.out.println(medel + " är medelvärdet.");
		
	}

}
