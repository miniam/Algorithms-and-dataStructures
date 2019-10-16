import java.util.Arrays;

public class InsertionSort {
	
	// this tests the insertion sort. 
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 3, 6, 5};
		InsertionSort.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// this function implements the insertion sort algorithm. 
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = i;
			while(key > 1 && arr[key] < arr[key-1]) 
				swap(arr, key-1, key);
			
		}
	}

	// this function swaps elements of certain indexes in the array. 
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}