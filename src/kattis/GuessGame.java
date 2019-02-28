package kattis;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		int point = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Välkommen till Gissa Talet!\r\nVälj svårighetsgrad:\r\n1 = Lätt\r\n2 = Medel \r\n3 = Svår");
		int dif = 0;
		while (dif > 3 || dif < 1) {
			dif = sc.nextInt();
			if (dif > 3 || dif < 1) {
				System.out.println("nice try, but no");
			}
		}
		if (dif == 1) {
			System.out.println("Lätt:\r\n" + "Slumpat tal är mellan 1-100\r\n" + 
					"Antal gissningar är 7\r\n" + "Poäng för rätt är 1");
		} else if (dif == 2) {
			System.out.println("Medel:\r\n" + "Slumpat tal är mellan 1-100\r\n" + 
					"Antal gissningar är 5\r\n" + "Poäng för rätt är 3");
		} else if (dif == 3) {
			System.out.println("Svår:\r\n" + "Slumpat tal är mellan 1-100\r\n" + 
					"Antal gissningar är 3\r\n" + "Poäng för rätt är 5");
		}

		point += Game(point, dif, sc);

		System.out.println("DU FÖRLORADE\rAntal poäng: " + point);

		sc.close();

	}

	public static int Game(int point, int dif, Scanner sc) {

		if (dif == 1) {
			// Easy

			int num = (int) (1 + (Math.random() * 10) + (Math.random() * 100));

			for (int i = 0; i < 7; i++) {
				int guess = sc.nextInt();

				if (guess < 1 || guess > 100) {
					System.out.println("Slösa inte gissningar");
				} else if (guess > num) {
					System.out.println("Talet är lägre");
				} else if (guess < num) {
					System.out.println("Talet är högre");
				} else {
					System.out.println("Rätt gissat\r\n" + "AGAIN");
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
					System.out.println("Slösa inte gissningar");
				} else if (guess > num) {
					System.out.println("Talet är lägre");
				} else if (guess < num) {
					System.out.println("Talet är högre");
				} else {
					System.out.println("Rätt gissat\r\n" + "AGAIN");
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
					System.out.println("Slösa inte gissningar");
				} else if (guess > num) {
					System.out.println("Talet är lägre");
				} else if (guess < num) {
					System.out.println("Talet är högre");
				} else {
					System.out.println("Rätt gissat\r\n" + "AGAIN");
					point += 5 + Game(point, dif, sc);
					break;
				}
			}

		}

		return point;
	}

}
