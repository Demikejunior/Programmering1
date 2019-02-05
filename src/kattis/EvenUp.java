package kattis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EvenUp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] val = new int[N];
		for (int i = 0; i < N; i++) {
			val[i] = sc.nextInt() % 2;
		}
		
		int sol = 1;
		Deque<Integer> que = new ArrayDeque<Integer>();
		que.addLast(val[0]);
		
		for (int i = 1; i < N; i++) {
			if (!que.isEmpty()) {
				if (val[i] == que.getLast()) {
					que.removeLast();
					sol--;
				} else {
					que.addLast(val[i]);
					sol++;
				} 
			} else {
				que.addLast(val[i]);
				sol++;
			}
		}
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
