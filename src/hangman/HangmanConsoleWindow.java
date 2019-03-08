package hangman;

import java.awt.*;
import javax.swing.*;

/**
 *
 * Denna class är till för att skapa ett alternativt konsol-fönster där man kan
 * skriva ut färgad text och fråga användaren efter input. Man kan även rensa
 * konsol-fönstret så att all tidigare utskriven text försvinner.
 * 
 * @author JaoK
 *
 */
public class HangmanConsoleWindow {

	private static final int WINDOW_WIDTH = 700;
	private static final int WINDOW_HEIGHT = 600;
	private static final Color BACKGROUND_COLOR = Color.WHITE;
	private static final Color TEXT_COLOR = Color.BLUE;
	private static final String FONT = "Bradley Hand ITC";
	private static final int FONT_SIZE = 40;
	private static final String TITLE = "Hangman Console Window";

	private JTextArea textarea;
	private JFrame window;

	/**
	 * Skapar och visar ett nytt HangmanConsoleWindow.
	 */
	public HangmanConsoleWindow() {
		textarea = createTextArea();
		window = createWindow();
		window.add(textarea);
		window.setVisible(true);
	}

	/**
	 * Skriver ut den givna strängen till fönstret följt av en ny rad.
	 * 
	 * @param str
	 *            sträng att skriva ut.
	 */
	public void println(String str) {
		print(str + "\n");
	}

	/**
	 * Skriver ut den givna strängen till fönstret.
	 * 
	 * @param str
	 *            sträng att skriva ut.
	 */
	public void print(String str) {
		textarea.append(str);
	}

	/**
	 * Skriver ut en tom rad till fönstret.
	 */
	public void println() {
		print("\n");
	}

	/**
	 * Rensar hela fönstret från all text.
	 */
	public void clear() {
		textarea.setText("");
	}

	/**
	 * Väntar på att användaren ska skriva ett tecken och returnerar det
	 * inskrivna tecknet.<br>
	 * <i> <b>OBS!</b> Ditt program kommer att fastna här ända tills användaren
	 * har skrivit in ett tecken! </i>
	 * 
	 * @return Det tecken som användaren skrev in.
	 */
	public char nextChar() {
		unlockTextarea();
		String text = textarea.getText();
		char c = getUserInput();
		while (c == '\b' || c == '\n') {
			textarea.setText(text);
			c = getUserInput();
		}
		lockTextarea();
		return c;
	}

	/**
	 * Väntar på att användaren ska skriva in en sekvens med tecken, utan
	 * mellanslag, och trycka enter.<br>
	 * <i> <b>OBS!</b> Ditt program kommer att fastna här ända tills användaren
	 * har skrivit något och tryckt ned Enter! </i>
	 * 
	 * @return En sträng med de tecken som användaren skrev in.
	 */
	public String nextString() {
		unlockTextarea();
		String str = "";
		char c;
		String text = textarea.getText();
		while (((c = getUserInput()) != '\n' || str.equals(""))) {
			if (c == '\b') {
				if (str.length() == 0)
					str = "";
				else
					str = str.substring(0, str.length() - 1);
			} else if (c != ' ' && c != '\n') {
				str += c;
			}
			textarea.setText(text + str);
		}
		lockTextarea();
		return str;
	}

	/**
	 * Stänger ned detta HangmanConsoleWindow.
	 */
	public void exit() {
		window.dispose();
	}

	/**
	 * Ändra färg på texten som visas i konsolen.
	 * 
	 * @param color
	 *            färgen att ändra till.
	 */
	public void changeTextColor(Color color) {
		textarea.setForeground(color);
	}

	private char getUserInput() {
		String text = textarea.getText();
		while (true) {
			if (!textarea.getText().equals(text)) {
				if (text.length() > textarea.getText().length())
					return '\b';
				char c = textarea.getText().charAt(textarea.getText().length() - 1);
				return c;
			}
			textarea.grabFocus();
			if (textarea.getCaretPosition() != text.length()) {
				textarea.setCaretPosition(textarea.getText().length());
			}
		}
	}

	private void lockTextarea() {
		textarea.setFocusable(false);
	}

	private void unlockTextarea() {
		textarea.setFocusable(true);
	}

	private int getScreenHeight() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		return screenSize.height;
	}

	private int getScreenWidth() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		return screenSize.width;
	}

	private JFrame createWindow() {
		JFrame swingComponent = new JFrame();
		swingComponent.setBounds(getScreenWidth() / 2 - WINDOW_WIDTH / 2, getScreenHeight() / 2 - WINDOW_HEIGHT / 2,
				WINDOW_WIDTH, WINDOW_HEIGHT);
		swingComponent.setResizable(false);
		swingComponent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		swingComponent.setTitle(TITLE);
		return swingComponent;
	}

	private JTextArea createTextArea() {
		JTextArea swingComponent = new JTextArea();
		swingComponent.setBackground(BACKGROUND_COLOR);
		swingComponent.setForeground(TEXT_COLOR);
		swingComponent.setFont(new Font(FONT, Font.PLAIN, FONT_SIZE));
		swingComponent.setFocusable(false);
		return swingComponent;
	}

}