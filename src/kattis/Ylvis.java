package kattis;

import java.util.Scanner;

public class Ylvis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int repet = sc.nextInt();
		String trash = sc.nextLine();
		for (int i = 0; i < repet; i++) {
			
			String[] noise = sc.nextLine().split(" ");
			
			String[] absolve = new String[noise.length];
			
			for (int j = 0; j < noise.length; j++) {
				
				String[] blue = sc.nextLine().split(" ");
				
				if (blue.length == 5) {
					break;
				} else {
					absolve[j] = blue[blue.length - 1];
				} 
				
			}
			String solve = "";
			
			for (int k = 0; k < noise.length; k++) {
				
				for (int l = 0; l < noise.length; l++) {
					
					if (noise[k].equals(absolve[l])) {
						noise[k] = "";
					}
					
				}
				
			}
			
			for (int l = 0; l < noise.length; l++) {
				
				if (!noise[l].equals("")) {
					solve += noise[l] + " ";
				}
				
			}
			
			System.out.println(solve);
			
		}
		
		sc.close();
		
	}
	
}
