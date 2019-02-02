package kattis;

import java.util.Scanner;

public class Hest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] c = new char[Integer.parseInt(sc.next())][Integer.parseInt(sc.next())];
		// creates two dimensional char array c with the next two integers as width as height
		boolean[][] stoneMap = new boolean[c.length][c[0].length];
		// creates a boolean array with the width and breadth of c
		visited = new boolean[c.length][c[0].length];
		// creates another boolean array with the width and breadth of c
		boolean hose = false;
		// boolean for help in identifying the first horse
		int[] place = new int[2];
		// the x and y value of the first horse
		int[] dest = new int [2];
		// the c and y value of the second horse

		for (int i = 0; i < c.length; i++) {
			// a for loop iterating over the width of c
			
			String str = sc.next();
			// the current row of the pasture
			
			for (int j = 0; j < c[i].length; j++) {
				// a for loop iterating over the breadth of c
				
				c[i][j] = str.charAt(j);
				// sets c at the current iteration of 
				
				if (c[i][j] == 'H' && !hose) {
					hose = true;
					place[0] = i;
					place[1] = j;
				} else if (c[i][j] == 'H' && hose) {
					dest[0] = i;
					dest[1] = j;
				}
				if (c[i][j] == '#') {
					stoneMap[i][j] = true;
				}
			}
		}
		
		DFS(stoneMap, place);
		
		if (visited[dest[0]][dest[1]]) {
			System.out.println("JA");
		} else {
			System.out.println("NEJ");
		}
		
		sc.close();

	}
	
	public static int[][] jump = 
		{
		{1, 2}, 
		{-1, 2}, 
		{1, -2}, 
		{-1, -2}, 
		{2, 1}, 
		{-2, 1}, 
		{2, -1}, 
		{-2, -1}
		};
	public static boolean[][] visited;
	
	public static void DFS(boolean[][] stoneMap, int[] place) {
		
		if (visited[place[0]][place[1]] || stoneMap[place[0]][place[1]]) {
			return;
		}
		visited[place[0]][place[1]] = true;
		for (int i = 0; i < jump.length; i++) {
			int[] nxtXY = {place[0] + jump[i][0], place[1] + jump[i][1]};
			try {
				DFS(stoneMap, nxtXY);
			} catch (Exception e) {}
		}
		
	}

}
