package kattis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CostumeContest {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {

			String str = sc.nextLine();

			if (!hmap.containsKey(str)) {
				hmap.put(str, 0);
			} else {
				hmap.put(str, hmap.get(str) + 1);
			}

		}

		Integer[] vals = (Integer[]) (hmap.values().toArray(new Integer[hmap.values().size()]));
		int lowest = 1000;

		for (int i = 0; i < vals.length; i++) {
			
			if (vals[i] <= lowest) {
				lowest = vals[i];
			}
			
		}

		String[] sol = hmap.keySet().toArray(new String[hmap.values().size()]);
		Arrays.sort(sol);
		for (int i = 0; i < sol.length; i++) {
			
			if (hmap.get(sol[i]) == lowest) {
				System.out.println(sol[i]);
			}
			
		}
		
		

		sc.close();

	}

}
