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

	public static String sjorovare(String str) {
		int l = str.length();
		
		char[] arr = str.toCharArray();
		String consS = "bcdfghjklmnpqrstvwz";
		char[] cons = consS.toCharArray();
		char[] Cons = consS.toUpperCase().toCharArray();
		
		String sol = "";
		for (int i = 0; i < l; i++) {
			
			for (int j = 0; j < cons.length; j++) {
					
				if (arr[i] == cons[j]) {
					String del = cons[j] + "o" + cons[j];
					sol = sol + del;
					break;
				} else if (arr[i] == Cons[j]) {
					String del = Cons[j] + "o" + cons[j];
					sol = sol + del;
					break;
				} else if (arr[i] == 'x') {
					sol = sol + "koksos";
					break;
				} else if(arr[i] == 'X'){
					sol = sol + "Koksos";
				} else if (j == cons.length - 1) {
					sol = sol + arr[i];
				}
				
			}
		
		}
		
		return sol;
		
	}

}
