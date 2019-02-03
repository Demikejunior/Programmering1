package kattis;

import java.util.Scanner;

public class EasternGothic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] boy = sc.nextLine().split(" ");
		double var = 0;

		for (int i = 0; i < boy.length; i++) {
			if (boy[i].contains("ae")) {
				var++;
			}
		}
		double t = var / boy.length;
		if (t >= 0.4) {
			System.out.println("dae ae ju traeligt va");
		} else {
			System.out.println("haer talar vi rikssvenska");
		}
		sc.close();
	}

}