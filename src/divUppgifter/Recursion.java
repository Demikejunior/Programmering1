package divUppgifter;

import java.util.HashMap;
import java.util.Scanner;

public class Recursion {

	public static HashMap<Double, Double> hmap = new HashMap<Double, Double>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(reverse(sc.nextLine()));

		System.out.println(sum(sc.nextInt()));

		System.out.println(fib(sc.nextInt()));
		
		hmap.clear();
		
		System.out.println(fibHash(sc.nextInt()));

		System.out.println(fac(sc.nextInt()));
		
		hmap.clear();

		System.out.println(facHash(sc.nextInt()));

		sc.close();

	}

	public static int sum(int s) {

		if (s == 1) {
			return 1;
		} else {
			return s + sum(s - 1);
		}

	}

	public static String reverse(String s) {

		if (s.length() == 1) {
			return s;
		} else {
			return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
		}

	}

	public static double fib(double f) {

		if (f <= 2) {
			return 1;
		} else {
			return fib(f - 1) + fib(f - 2);
		}

	}
	
	public static double fibHash(double f) {
		
		if (hmap.containsKey(f)) {
			
			return hmap.get(f);
			
		} else if (f <= 2) {
			
			return 1;
			
		} else {
			
			hmap.put(f, fibHash(f - 1) + fibHash(f - 2));
			return hmap.get(f);
			
		}
		
	}

	public static int fac(int f) {

		if (f == 2) {
			
			return f;
			
		} else {
			
			return f * fac(f - 1);
			
		}

	}

	public static double facHash(double f) {

		if (f == 2) {

			return f;

		} else if (hmap.containsKey(f)) {

			return hmap.get(f);

		} else {

			hmap.put(f, f * facHash(f - 1));
			return hmap.get(f);
			
		}

	}

}
