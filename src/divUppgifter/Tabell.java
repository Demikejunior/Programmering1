package divUppgifter;

public class Tabell {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 0; j <= 10; j++) {
				
				if (i * j < 10) {
					System.out.print(j * i + "   ");
				}else if (i * j < 100) {
					System.out.print(j * i + "  ");
				}else {
					System.out.print(j * i + " ");
				}
				
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
