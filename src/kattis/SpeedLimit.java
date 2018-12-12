package kattis;

import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int var = sc.nextInt();
			if (var == -1) {
				break;
			}
			
			int[] spd = new int[var];
			int[] lgt = new int[var];
			int sol = 0;
			
			for (int i = 0; i < var; i++) {
				spd[i] = sc.nextInt();
				lgt[i] = sc.nextInt();
			}
			for (int i = 0; i < var; i++) {
				
				if (i == 0) {
					sol += spd[i] * lgt[i];
				} else {
					sol += spd[i] * (lgt[i] - lgt[i-1]);
				}
			}
			System.out.println(sol + " miles");
			
		}
		sc.close();
	}
	
}
