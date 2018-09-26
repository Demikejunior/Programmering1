package divUppgifter;
import java.util.Scanner;

public class v38_Loops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		//Inlämning 1
		
		double sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("\rFärdig med Inlämning 1\r");
		
		
		
		//Inlämning 2

		for (int i = 25; i <= 50; i++) {

			System.out.println(i);

		}
		System.out.println("\rFärdig med Inlämning 2\r");
		
		
		
		//Inlämning 3

		for (int i = 20; i >= 0; i--) {
			
			System.out.println(i);
			
		}
		System.out.println("\rFärdig med Inlämning 3\r");
		
		
		
		//Inlämning 4

		System.out.println("Skriv ett heltal mellan 0 och 10");
		
		byte var = input.nextByte();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(i*var + " ");
			
		}
		System.out.println("\rFärdig med Inlämning 4\r");
		
		
		
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
		System.out.println("\rFärdig med Inlämning 5\r");
		
		
		
		//Inlämning 6
		
		exit = false;
		
		System.out.println("\rSkriv in ord\r");
		
		
		while (!exit) {
			String line = input.nextLine();
			
			if (line.equals("exit")) {
				exit = true;
			}
			
		}
		System.out.println("\rFärdig med Inlämning 6\r");
		
		
		
		//Inlämning 7
		
		System.out.println("Skriv in ett heltal");
		
		int ecks = input.nextInt();
		
		for (int i = 0; i < ecks; i++) {
			
			for (int j = 0 ; j <= i ; j++) {
				
				System.out.print("x");
			
			}
			System.out.println("");
			
		}
		System.out.println("\rFärdig med Inlämning 7\r");
		
		

		//Inlämning 8
		
		for (int i = 100; i <= 1000; i ++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("\rFärdig med Inlämning 8\r");
		
		
		
		//Inläming 9
		
		System.out.println("Fakultet");
		
		int fac = 1;
		int in = input.nextInt();
		for (int i = in; i >= 1; i--) {
			fac = fac * i;
			System.out.print(fac + " * " + i + " => ");
		}
		System.out.println("\r" + fac);
		System.out.println("\rFärdig med Inlämning 9\r");
		
		
		
		//Inlämning fibonacci
		
		System.out.println("Skriv ett nummer");
		in = input.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 1;
		for (int i = 1; i <= in; i++) {
			System.out.print(fib1 + " " + fib2 + " " + fib3 + " ");
			fib1 = fib2 + fib3;
			fib2 = fib3 + fib1;
			fib3 = fib1+ fib2;
		}
		System.out.print(fib1 + " " + fib2 + " " + fib3 + " ");
		System.out.println("\rFärdig med Fibonacci\r");

		input.close();

	}

}
