import java.util.Scanner;

public class M�nniska {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ditt f�r- & efternamn");
		
		String namn = input.nextLine();
		
		System.out.println("Skriv hur m�nga hela �r du har existerat");
		
		int �r = input.nextInt();
		
		System.out.println("Skriv din adress");
		
		String adress = input.nextLine();
		
		System.out.println("Skriv ditt postnummer");
		
		int post = input.nextInt();
		
		System.out.println("Skriv vilken stad du bor i");
		
		String stad = input.nextLine();
		
		System.out.println("Skriv ditt telefonnummer");
		
		int telefon = input.nextInt();
		
		
		
		input.close();
	}
	
}
