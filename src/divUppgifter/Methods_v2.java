package divUppgifter;

public class Methods_v2 {
	public static void main(String[] args) {

	}

	public static double volume(double radius) {
		double r = (Math.pow(radius, 3) * Math.PI) / 4;
		return r;
	}

	public static String reverse(String str) {
		int l = str.length();
		char[] arr = new char[l];
		for (int i = l - 1; i >= 0; i--) {
			arr[l - (i + 1)] = str.charAt(i);
		}
		String s = new String(arr);
		return s;
	}

	public static int count(String str, char c) {
		int l = str.length();
		int t = 0;
		for (int i = 0; i < l; i++) {
			if (str.charAt(i) == (c)) {
				t++;
			}
		}
		return t;
	}

	public static String sjorovare(String str) { // R�varspr�k metod

		int length = str.length(); // L�ngden av input String

		char[] arr = str.toCharArray(); // Skapar en character array av input String

		String consS = "bcdfghjklmnpqrstvwz"; // Skapar en String av alla konsonanter

		char[] cons = consS.toCharArray(); // Skapar en character array av alla sm� konsonanter

		char[] Cons = consS.toUpperCase().toCharArray(); // Skapar en character array av alla stora konsonanter

		String sol = ""; // Skapar en tom String f�r att senare l�gga till delar, sedan returna den

		for (int i = 0; i < length; i++) { // Loopa length antal g�nger

			for (int j = 0; j < cons.length; j++) { // Loopa lika m�nga g�nger som det finns konsonanter, h�r ska man d�
													// j�mf�ra karakt�ren vid i med alla konsonanter, b�de stora, och
													// sm�

				if (arr[i] == cons[j]) { // Om det �r en liten konsonant, d� g�r detta

					String del = cons[j] + "o" + cons[j]; // f�rst skapa en delString som �r den tidigare konsonanten
															// tv� g�nger med ett o i mitten

					sol = sol + del; // Sedan l�gg till delStringen till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (arr[i] == Cons[j]) { // Om det �r en stor konsonant d� g�r detta

					String del = Cons[j] + "o" + cons[j]; // F�rst skapa en delString som �r den konsonanten (stor), ett
															// o, sedan samma konsonant, fast liten

					sol = sol + del; // Sedan l�gg till delStringen till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (arr[i] == 'x') { // Om det �r ett litet x

					sol = sol + "koksos"; // L�gg till koksos till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (arr[i] == 'X') { // Om det �r ett stort x

					sol = sol + "Koksos"; // L�gg till Koksos till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (j == cons.length - 1) { // Om man har g�tt igenom loopen helt, utan att den har blivit
													// j�mf�rd med n�got av de tidigare if-statements, d� g�r detta

					sol = sol + arr[i]; // L�gg till tecknet till sol

				}

			}

		}

		return sol; // returna sol

	}

	public static String sjorovare2(String str) { // R�varspr�k metod

		String cons = "bcdfghjklmnpqrstvwz"; // Skapar en String av alla konsonanter

		String sol = ""; // Skapar en tom String f�r att senare l�gga till delar, sedan returna den

		for (int i = 0; i < str.length(); i++) { // Loopa s� m�nga g�nger som det finns karakt�rer i str

			for (int j = 0; j < cons.length(); j++) { // Loopa lika m�nga g�nger som det finns konsonanter, h�r ska man
														// d� j�mf�ra karakt�ren vid i med alla konsonanter, b�de stora,
														// och sm�

				if (str.charAt(i) == cons.charAt(j) || str.charAt(i) == cons.toUpperCase().charAt(j)) { // Om det �r en
																										// liten
																										// konsonant, d�
																										// g�r detta

					String del = str.charAt(i) + "o" + str.toLowerCase().charAt(i); // f�rst skapa en delString som �r
																					// den tidigare konsonanten
																					// tv� g�nger med ett o i mitten

					sol = sol + del; // Sedan l�gg till delStringen till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (str.charAt(i) == 'x') { // Om det �r ett litet x

					sol = sol + "koksos"; // L�gg till koksos till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (str.charAt(i) == 'X') { // Om det �r ett stort x

					sol = sol + "Koksos"; // L�gg till Koksos till sol

					break; // Sluta j�mf�ra karakt�rer vid i

				} else if (j == cons.length() - 1) { // Om man har g�tt igenom loopen helt, utan att den har blivit
														// j�mf�rd med n�got av de tidigare if-statements, d� g�r detta

					sol = sol + str.charAt(i); // L�gg till tecknet till sol

				}

			}

		}

		return sol; // returna sol

	}

}
