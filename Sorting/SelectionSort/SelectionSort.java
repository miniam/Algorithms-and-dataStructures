import java.util.Arrays;

public class SelectionSort {
	// tests the Selection Sort Algorithm. 
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 3, 4, 6};
		SelectionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// Swaps elements of certain indexes. 
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	// Implements the Selection Sort. 
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			swap(arr, i, findSmallest(arr, i));
		}
	}

	// finds the smallest element 
	public static int findSmallest(int[] arr, int start) {
		int toReturn = start;

		for(int i = start; i < arr.length; i++) 
			if(arr[i] < arr[toReturn])
				toReturn = i;
		
		return toReturn;
	}
}