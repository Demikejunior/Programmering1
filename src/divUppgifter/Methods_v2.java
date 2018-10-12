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
			arr[l-(i+1)] = str.charAt(i);
		}
		String s = new String(arr);
		return s;
		
	}
	
}
