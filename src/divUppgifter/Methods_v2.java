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

	public static String sjorovare(String str) { // Rövarspråk metod

		int length = str.length(); // Längden av input String

		char[] arr = str.toCharArray(); // Skapar en character array av input String

		String consS = "bcdfghjklmnpqrstvwz"; // Skapar en String av alla konsonanter

		char[] cons = consS.toCharArray(); // Skapar en character array av alla små konsonanter

		char[] Cons = consS.toUpperCase().toCharArray(); // Skapar en character array av alla stora konsonanter

		String sol = ""; // Skapar en tom String för att senare lägga till delar, sedan returna den

		for (int i = 0; i < length; i++) { // Loopa length antal gånger

			for (int j = 0; j < cons.length; j++) { // Loopa lika många gånger som det finns konsonanter, här ska man då
													// jämföra karaktären vid i med alla konsonanter, både stora, och
													// små

				if (arr[i] == cons[j]) { // Om det är en liten konsonant, då gör detta

					String del = cons[j] + "o" + cons[j]; // först skapa en delString som är den tidigare konsonanten
															// två gånger med ett o i mitten

					sol = sol + del; // Sedan lägg till delStringen till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (arr[i] == Cons[j]) { // Om det är en stor konsonant då gör detta

					String del = Cons[j] + "o" + cons[j]; // Först skapa en delString som är den konsonanten (stor), ett
															// o, sedan samma konsonant, fast liten

					sol = sol + del; // Sedan lägg till delStringen till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (arr[i] == 'x') { // Om det är ett litet x

					sol = sol + "koksos"; // Lägg till koksos till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (arr[i] == 'X') { // Om det är ett stort x

					sol = sol + "Koksos"; // Lägg till Koksos till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (j == cons.length - 1) { // Om man har gått igenom loopen helt, utan att den har blivit
													// jämförd med något av de tidigare if-statements, då gör detta

					sol = sol + arr[i]; // Lägg till tecknet till sol

				}

			}

		}

		return sol; // returna sol

	}

	public static String sjorovare2(String str) { // Rövarspråk metod

		String cons = "bcdfghjklmnpqrstvwz"; // Skapar en String av alla konsonanter

		String sol = ""; // Skapar en tom String för att senare lägga till delar, sedan returna den

		for (int i = 0; i < str.length(); i++) { // Loopa så många gånger som det finns karaktärer i str

			for (int j = 0; j < cons.length(); j++) { // Loopa lika många gånger som det finns konsonanter, här ska man
														// då jämföra karaktären vid i med alla konsonanter, både stora,
														// och små

				if (str.charAt(i) == cons.charAt(j) || str.charAt(i) == cons.toUpperCase().charAt(j)) { // Om det är en
																										// liten
																										// konsonant, då
																										// gör detta

					String del = str.charAt(i) + "o" + str.toLowerCase().charAt(i); // först skapa en delString som är
																					// den tidigare konsonanten
																					// två gånger med ett o i mitten

					sol = sol + del; // Sedan lägg till delStringen till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (str.charAt(i) == 'x') { // Om det är ett litet x

					sol = sol + "koksos"; // Lägg till koksos till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (str.charAt(i) == 'X') { // Om det är ett stort x

					sol = sol + "Koksos"; // Lägg till Koksos till sol

					break; // Sluta jämföra karaktärer vid i

				} else if (j == cons.length() - 1) { // Om man har gått igenom loopen helt, utan att den har blivit
														// jämförd med något av de tidigare if-statements, då gör detta

					sol = sol + str.charAt(i); // Lägg till tecknet till sol

				}

			}

		}

		return sol; // returna sol

	}

}
