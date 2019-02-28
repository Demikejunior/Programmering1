package kattis;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		int point = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("V�lkommen till Gissa Talet!\r\nV�lj sv�righetsgrad:\r\n1 = L�tt\r\n2 = Medel \r\n3 = Sv�r");
		int dif = 0;
		while (dif > 3 || dif < 1) {
			dif = sc.nextInt();
			if (dif > 3 || dif < 1) {
				System.out.println("nice try, but no");
			}
		}
		if (dif == 1) {
			System.out.println("L�tt:\r\n" + "Slumpat tal �r mellan 1-100\r\n" + 
					"Antal gissningar �r 7\r\n" + "Po�ng f�r r�tt �r 1");
		} else if (dif == 2) {
			System.out.println("Medel:\r\n" + "Slumpat tal �r mellan 1-100\r\n" + 
					"Antal gissningar �r 5\r\n" + "Po�ng f�r r�tt �r 3");
		} else if (dif == 3) {
			System.out.println("Sv�r:\r\n" + "Slumpat tal �r mellan 1-100\r\n" + 
					"Antal gissningar �r 3\r\n" + "Po�ng f�r r�tt �r 5");
		}

		point += Game(point, dif, sc);

		System.out.println("DU F�RLORADE\rAntal po�ng: " + point);

		sc.close();

	}

	public static int Game(int point, int dif, Scanner sc) {

		if (dif == 1) {
			// Easy

			int num = (int) (1 + (Math.random() * 10) + (Math.random() * 100));

			for (int i = 0; i < 7; i++) {
				int guess = sc.nextInt();

				if (guess < 1 || guess > 100) {
					System.out.println("Sl�sa inte gissningar");
				} else if (guess > num) {
					System.out.println("Talet �r l�gre");
				} else if (guess < num) {
					System.out.println("Talet �r h�gre");
				} else {
					System.out.println("R�tt gissat\r\n" + "AGAIN");
					point += 1 + Game(point, dif, sc);
					break;
				}
			}

		} else if (dif == 2) {
			// Medium

			int num = (int) (1 + (Math.random() * 10) + (Math.random() * 100));
			for (int i = 0; i < 5; i++) {
				int guess = sc.nextInt();

				if (guess < 1 || guess > 100) {
					System.out.println("Sl�sa inte gissningar");
				} else if (guess > num) {
					System.out.println("Talet �r l�gre");
				} else if (guess < num) {
					System.out.println("Talet �r h�gre");
				} else {
					System.out.println("R�tt gissat\r\n" + "AGAIN");
					point += 3 + Game(point, dif, sc);
					break;
				}
			}

		} else if (dif == 3) {
			// Hard
			
			int num = (int) (1 + (Math.random() * 10) + (Math.random() * 100));
			for (int i = 0; i < 3; i++) {
				int guess = sc.nextInt();

				if (guess < 1 || guess > 100) {
					System.out.println("Sl�sa inte gissningar");
				} else if (guess > num) {
					System.out.println("Talet �r l�gre");
				} else if (guess < num) {
					System.out.println("Talet �r h�gre");
				} else {
					System.out.println("R�tt gissat\r\n" + "AGAIN");
					point += 5 + Game(point, dif, sc);
					break;
				}
			}

		}

		return point;
	}

}
