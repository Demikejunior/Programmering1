package divUppgifter;

import java.util.Scanner;

public class Beer {
	
	public static void main(String[] args) {
		while(true) {
			for (int i = 99; i > 1; i--) {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. \r\n Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.");
				drink();
				System.out.println();
			}
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer. \r\n Take one down and pass it around, no more bottles of beer on the wall.");
			System.out.println();
			System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
					"Go to the store and buy some more, 99 bottles of beer on the wall.");
			
		}
	}
	
	public static void drink() {
		boolean var = false;
		Scanner in = new Scanner(System.in);
		while (!var) {
			
			try {
				String d = in.next();
				if (d.toLowerCase().equals("drink") || d.toLowerCase().equals("drank") || d.toLowerCase().equals("drunk") || d.toLowerCase().equals("drnk") || d.toLowerCase().equals("drnik")) {
						var = true;
				}
			} catch (Exception e) {
				
			}
			
		}
		in.close();
	}
	
}
