package divUppgifter;

public class Sumodulus {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 10000; i++) {

			if (i % 7 == 0) {
				sum = sum + i;
			}

		}

		System.out.println(sum);

	}

}
