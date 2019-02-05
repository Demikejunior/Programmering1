package kattis;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger val1 = sc.nextBigInteger();
		BigInteger val2 = sc.nextBigInteger();
		BigInteger sol = val1.add(val2);
		
		System.out.println(sol);
		
		sc.close();
		
	}
	
}
