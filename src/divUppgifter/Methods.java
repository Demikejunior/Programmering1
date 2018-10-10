package divUppgifter;

public class Methods {

	public static void main(String[] args) {

		stair(5);

	}

	public static void lol() {
		System.out.println("HAHAHAHAHAHAHA");
	}

	public static int min(int a, int b) {
		if (a <= b) {
			return a;
		} else {
			return b;
		}

	}

	public static void count(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static double kelvin(double c) {
		return c - 273.15;
	}

	public static void ageControl(int age) {
		if (age < 0) {
			System.out.println("Existerar ej");
		} else if (age < 6) {
			System.out.println("Småbarn får inte göra något");
		} else if (age < 13) {
			System.out.println("Du får spela Fortnite");
		} else if (age < 15) {
			System.out.println("Du är tonåring");
		} else if (age < 18) {
			System.out.println("Du får köra moppe");
		} else if (age < 20) {
			System.out.println("Du får köra bil");
		} else if (age < 65) {
			System.out.println("Du får gå på systemet");
		} else if (age < 100) {
			System.out.println("Du är pensionär");
		} else {
			System.out.println("R.I.P");
		}

	}

	public static void stair(int steps) {
		for (int i = 1; i <= steps; i++) {
			for (int s = steps; s > i; s--) {
				System.out.print(" ");
			}
			for (int x = 0; x < i; x++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
