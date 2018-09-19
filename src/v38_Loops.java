import java.util.Scanner;

public class v38_Loops {

	public static void main(String[] args) {
		
		
		//Inlämning 1
		
		double sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("\rFärdig med Inlämning 1");
		
		
		//Inlämning 2

		for (int i = 25; i <= 50; i++) {

			System.out.println(i);

		}
		System.out.println("\rFärdig med Inlämning 2");
		
		
		//Inlämning 3

		for (int i = 20; i >= 0; i--) {
			
			System.out.println(i);
			
		}
		System.out.println("\rFärdig med Inlämning 3");
		
		
		//Inlämning 4

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett heltal mellan 0 och 10");
		
		byte var = input.nextByte();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(i*var + " ");
			
		}
		System.out.println("\rFärdig med Inlämning 4");
		
		
		//Inlämning 5
		
		boolean exit = false;
		
		System.out.println("\rSkriv in nummer");
		
		sum = 0;
		
		while (!exit) {
			int tal1 = input.nextInt();
			
			if (tal1 == 0) {
				exit = true;
			}
			
			sum = tal1 + sum;
			
		}
		System.out.println(sum);
		System.out.println("\rFärdig med Inlämning 5");
		
		
		//Inlämning 6
		
		exit = false;
		
		System.out.println("\rSkriv in ord");
		
		
		while (!exit) {
			String line = input.nextLine();
			
			if (line.equals("exit")) {
				exit = true;
			}
			
		}
		System.out.println("\rFärdig med Inlämning 6");
		
		
		//Inlämning 7
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0 ; j <= i ; j++) {
				
				System.out.print("x");
			
			}
			System.out.println("");
			
		}
		System.out.println("\rFärdig med Inlämning 7");
		
		
		

		input.close();

	}

}
