import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers");

		int x = input.nextInt();
		int y = input.nextInt();

		input.close(); //END Scanner

		if (x > 0 && y > 0) {
			System.out.println(1);
		}

		if (x > 0 && y < 0) {
			System.out.println(4);
		}

		if (x < 0 && y < 0) {
			System.out.println(2);
		}

		if (x < 0 && y > 0) {
			System.out.println(3);
		}

		if (x > 0 && y == 0) {
			System.out.println(41);
		}

		if (x == 0 && y < 0) {
			System.out.println(12);
		}

		if (x < 0 && y == 0) {
			System.out.println(23);
		}

		if (x == 0 && y > 0) {
			System.out.println(34);
		}

		if (x == 0 && y == 0) {
			System.out.println("Origin");
		}

	} // END main

} // END helloWorld
