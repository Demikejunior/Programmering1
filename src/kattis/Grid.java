package kattis;

import java.util.Scanner;

public class Grid {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		char[][] gridC = new char[x][y];
		
		for (int i = 0; i < gridC.length; i++) {
			gridC[i] = sc.nextLine().toCharArray();
		}
		int[][] reachable = new int[x][y];
		for (int i = 0; i < reachable.length; i++) {
			for (int j = 0; j < reachable[0].length; j++) {
				reachable[i][j] = -1;
			}
		}
		
		
		
		
		System.out.println(reachable[x][y]);
		
		sc.close();
		
	}
	
}
