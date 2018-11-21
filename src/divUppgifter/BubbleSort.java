package divUppgifter;

public class BubbleSort {

	public static void main(String[] args) {
		
	}
	
	public static void sort(int[] array) {
		int comparisons = 0;
		int swaps = 0;
		for (int j = 0; j < array.length; j++) {
			boolean hasSwapped = false;
			for (int i = 0; i < array.length - 1 - j; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					hasSwapped = true;
					swaps++;
				}
				comparisons++;
			}
			if (!hasSwapped) {
				break;
			}
		}
		System.out.println("Comparisons = "+comparisons + "\nSwaps = " + swaps);
		
	}
	
}
