package hangman;


public class HangGame {
	
	public static String word;
	public static String reverseWord;
	public static int lives;
	
	public HangGame(String initWord) {
		HangmanConsoleWindow hcw = new HangmanConsoleWindow();
		hcw.println("V�lkommen till h�ngagubben! \r\n" + "Du har " + lives + " liv");
		word = initWord;
		
		
	}
	
	public static void paint() {
		
	}
	
	private static String reverse(String toReverse) {
		
	}
	
}
