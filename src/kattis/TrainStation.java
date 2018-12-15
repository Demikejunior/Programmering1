package kattis;

import java.util.Scanner;

public class TrainStation {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cap = sc.nextInt();
		int stat = sc.nextInt();
		int tot = 0;
		boolean failed = false;
		
		tot = tot - sc.nextInt();
		if (tot < 0) {
			failed = true;
		} else {
			
			tot = tot + sc.nextInt();
			int wait = sc.nextInt();
			if (tot > cap || tot < 0 || (tot < cap && wait > 0)) {
				failed = true;
			} else {
				
				for (int i = 1; i < stat; i++) {
					tot = tot - sc.nextInt();
					tot = tot + sc.nextInt();
					wait = sc.nextInt();
					if (tot > cap || tot < 0 || (tot < cap && wait > 0)) {
						failed = true;
						break;
					}
					
				}
				
			}
			
		}
		if (!failed && tot == 0) {
			System.out.println("possible");
		} else {
			System.out.println("impossible");
		}
		
		sc.close();
	}
}
