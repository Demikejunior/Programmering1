import java.util.Scanner;

public class v38_Loops {

	public static void main(String[] args) {
		
		
		//Inlämning 1
		
		double sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		//Inlämning 2

		for (int i = 25; i <= 50; i++) {

			System.out.println(i);

		}
		
		
		//Inlämning 3

		for (int i = 20; i >= 0; i--) {
			
			System.out.println(i);
			
		}
		
		
		//Inlämning 4

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett heltal mellan 0 och 10");
		
		byte var = input.nextByte();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(i*var + " ");
			
		}
		
		
		//Inlämning 5
		
		boolean exit = false;
		
		System.out.println("\n\rSkriv in nummer");
		
		sum = 0;
		
		while (!exit) {
			int tal1 = input.nextInt();
			
			if (tal1 == 0) {
				exit = true;
			}
			
			sum = tal1 + sum;
			
		}
		System.out.println(sum);
		
		

		input.close();

	}

}
