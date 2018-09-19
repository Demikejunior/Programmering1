import java.util.Scanner;

public class v38_Loops {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		for (int i = 25; i <= 50; i++) {

			System.out.println(i);

		}

		for (int i = 20; i >= 0; i--) {
			
			System.out.println(i);
			
		}

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett heltal mellan 0 och 10");
		
		byte var = input.nextByte();
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(i*var + " ");
			
		}

		input.close();

	}

}
