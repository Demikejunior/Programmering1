package divUppgifter;

import java.util.Scanner;

public class Cylinder {
	
	public static void main(String[] args) {
		
		System.out.println("Skriv en radie, och en h�jd");
		
		Scanner input = new Scanner(System.in);
		
		double area = input.nextDouble() * 3.14;
		
		double height = input.nextDouble();
		
		System.out.println("Cylinderns area �r: " + area * height);
		
		input.close();
		
	}
	
}
