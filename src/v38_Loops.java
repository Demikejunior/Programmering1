
public class v38_Loops {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		for (int i = 25; i <= 50; i++) {

			System.out.println(i);

		}
		
		for (int i = 20; i >= Integer.MIN_VALUE; i--) {
			System.out.println(i);
		}

	}

}
