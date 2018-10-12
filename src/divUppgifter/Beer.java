package divUppgifter;

import java.util.Scanner;

public class Beer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean boo = true;
		
		while (boo) {
			for (int i = 99; i > 1; i--) {
				System.out.println(i + " bottles of beer on the wall, " + i
						+ " bottles of beer. \r\nTake one down, pass it around,  " + (i - 1)
						+ " bottles of beer on the wall.");
				drink(in);
			}
			System.out.println(
					"1 bottle of beer on the wall, 1 bottle of beer. \r\nTake one down and pass it around, no more bottles of beer on the wall.");
			System.out.println();
			boolean var = false;
			
			System.out.println("Buy some more, or exit this vicious cycle?");
			while (!var) {
				var = false;
				String d = in.nextLine();
				if (d.toLowerCase().equals("buy")) {
					var = true;
					System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n"
							+ "Go to the store and buy some more, 99 bottles of beer on the wall. \r\n");
				} else if (d.toLowerCase().equals("exit")) {
					var = true;
					boo = false;
					System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n"
							+ "You think some time and say some rhymes, no more bottles of beer on the wall. \r\n");
				}

			}
			
		}
		in.close();

	}

	public static void drink(Scanner in) {
		boolean var = false;
		while (!var) {
			var = false;
			String d = in.nextLine();
			if (d.toLowerCase().equals("drink")) {
				var = true;
			}

		}

	}

}
