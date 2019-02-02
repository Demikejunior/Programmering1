package kattis;

import java.util.Scanner;

public class WalrusWeights {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int intended = 1000;
		boolean[] poss = new boolean[2 * intended + 1];
		int[] weights = new int[n];
		
		for (int i = 0; i < weights.length; i++) {
			weights[i] = sc.nextInt();
		}
		
		for (int summa = 0; summa < n; summa++) {
			boolean[] newPoss = new boolean[2 * intended + 1];
			for (int vikt = 0; vikt < newPoss.length; vikt++) {
				if (poss[vikt]) {
					newPoss[vikt] = true;
					if (summa + vikt <= 2 * intended) {
						newPoss[summa + vikt] = true;
					}
					
				}
				
			}
			poss = newPoss;
			
		}

		int sol = 0;
		
		if (poss[intended]) {
			sol = intended;
		} else {
			for (int i = 0; i <= 2 * intended; i++) {
				if (i % 2 == 1) {
					sol = 1000 + ((i + 1) / 2);
				} else if (i % 2 == 0) {
					sol = 1000 - (i / 2);
				}
			} 
		}
	
	
		System.out.println(sol);
		
		sc.close();
		
	}

}
