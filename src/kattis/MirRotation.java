package kattis;

import java.util.Scanner;

public class MirRotation {
	
	public static void main(String[] args) {
		char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', '.'};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int var = sc.nextInt();
			
			if (var == 0) {
				break;
			}
			String str = sc.nextLine().toUpperCase();
			str = str.replaceAll(" ", "");
			char[] rot = str.toCharArray();
			
			for (int i = 0; i < (rot.length / 2); i++) {
				char temp = rot[i];
				rot[i] = rot[rot.length - (i + 1)];
				rot[rot.length - (i + 1)] = temp;
			}
			
			for (int i = 0; i < rot.length; i++) {
				for (int j = 0; j < alpha.length; j++) {
					if (rot[i] == alpha[j]) {
						
						rot[i] = alpha[(j+var) % 28];
						
						break;
					}
				} 
			}
			String end = new String(rot);
			System.out.println(end);
			
		}
		sc.close();
		
	}
	
}
