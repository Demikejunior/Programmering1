package divUppgifter;
import java.util.Scanner;

public class M�nniska {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ditt f�r- & efternamn");
		
		String namn = input.nextLine();
		
		System.out.println("Skriv hur m�nga hela �r du har existerat");
		
		String �r = input.nextLine();
		
		System.out.println("Skriv din adress");
		
		String adress = input.nextLine();
		
		System.out.println("Skriv ditt postnummer");
		
		String post = input.nextLine();
		
		System.out.println("Skriv vilken stad du bor i");
		
		String stad = input.nextLine();
		
		System.out.println("Skriv ditt telefonnummer");
		
		String telefon = input.nextLine();
		
		
		System.out.println("Information:");
		
		System.out.println("Namn:    " + namn);
		
		System.out.println("�lder:   " + �r + " �r");
		
		System.out.println("Adress:  " + adress + "\n         " + post + " " + stad);
		
		System.out.println("Telefon: " + telefon);
		
		
		input.close();
	}
	
}
