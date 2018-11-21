package divUppgifter;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = {0, 5, 4, 1, 0, 4, 92, 9, 4, 2, 7, 6};
		BubbleSort.sort(arr);
		System.out.println("arr längd = " + arr.length + "\r" + Arrays.toString(arr));
		int[] arr2 = {0, 5, 4, 1, 0, 4, 92, 9, 4, 2, 7, 6};
		InsertionSort.sort(arr2);
		System.out.println("arr längd = " + arr2.length + "\r" + Arrays.toString(arr2));
	}
	
}
