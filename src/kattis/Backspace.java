package kattis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Backspace {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Deque<Character> que = new ArrayDeque<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				que.removeLast();
			} else {
				que.addLast(str.charAt(i));
			}
		}
		
		StringBuilder sol = new StringBuilder(que.size());
		for (int i = 0; i < str.length(); i++) {
			if (que.peekFirst() != null) {
				sol.append(que.pollFirst());
			} else {
				break;
			}
		}
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
