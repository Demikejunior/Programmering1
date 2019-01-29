package kattis;

import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int letters = sc.nextInt();
		String trash = sc.nextLine();
		trash.length();
		
		for (int a = 0; a < letters; a++) {
			
			String msg = sc.nextLine();
			int msgsqr = (int) Math.sqrt(msg.length());
			char[][] decode = new char[msgsqr][msgsqr];
			int k = 0;
			
			for (int i = 0; i < msgsqr; i++) {
				
				for (int j = msgsqr - 1; j >= 0; j--) {
					
					decode[i][j] = msg.charAt(k);
					
					k++;
					
				}
				
			}
			String sol = "";
			
			for (int i = 0; i < msgsqr; i++) {
				
				for (int j = 0; j < msgsqr; j++) {
					
					sol = sol + decode[j][i];
					
				}
				
			}
			
			System.out.println(sol);
			
		}
		
		sc.close();
		
	}
	

}
