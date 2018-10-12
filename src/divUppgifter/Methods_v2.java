package divUppgifter;

public class Methods_v2 {
	public static void main(String[] args) {
		System.out.println(count("abacabadabacaba", 'd'));
	}
	
	public static double volume(double radius) {
		double r = (Math.pow(radius, 3) * Math.PI) / 4;
		return r;
	}
	
	public static String reverse(String str) {
		int l = str.length();
		char[] arr = new char[l];
		for (int i = l - 1; i >= 0; i--) {
			arr[l-(i+1)] = str.charAt(i);
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
	
}
