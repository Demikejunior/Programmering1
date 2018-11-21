package kattis;

import java.util.Scanner;

public class Ylvis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < sc.nextInt(); i++) {
			String solve = null;
			String[] noise = sc.nextLine().split(" ");
			String[] absolve = new String[noise.length];
			boolean exit = false;
			int j = 0;
			while(!exit) {
				String[] blue = sc.nextLine().split(" ");
				if (blue.length == 5) {
					exit = true;
				} else {
					absolve[j] = blue[2];
				}
			}
			for (int k = 0; k < noise.length; k++) {
				for (int l = 0; l < noise.length; l++) {
					if (!noise[k].equals(absolve[l])) {
						solve += noise[k];
					}
				}
			}
			
			System.out.println(solve);
			
		}
		
		
		sc.close();
		
	}
	
}
