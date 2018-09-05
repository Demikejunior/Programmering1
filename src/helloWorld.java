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
			System.out.println("Border line between 4 & 1");
		}

		if (x == 0 && y < 0) {
			System.out.println("Border line between 1 & 2");
		}

		if (x < 0 && y == 0) {
			System.out.println("Border line between 2 & 3");
		}

		if (x == 0 && y > 0) {
			System.out.println("Border line between 3 & 4");
		}

		if (x == 0 && y == 0) {
			System.out.println("Origin");
		}

	} // END main

} // END helloWorld
