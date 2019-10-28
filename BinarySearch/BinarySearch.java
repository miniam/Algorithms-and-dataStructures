public class BinarySearch {
  /* This method allows you to search an array with a bnary search algorithm,
  which as an order of growth of O(log(n)). This is useful for parsing large
  data sets. NOTE: The arr must be in either alphabetical (a-z) or numerical (low-high)
  order. */

  public static void main(String[] args) {
    int[] intArr = {1, 2, 3, 4, 5};
    String[] strArr = {"test a", "test b", "test c", "test d", "test e"};

    System.out.println("Index of 4 in intArr: " + binSearchInt(intArr, 4));
    System.out.println("Index of 'test c' in strArr: " + binSearchStr(strArr, "test c"));


  }

  static int binSearchInt(int[] arr, int numQuery) {
		int high = arr.length - 1;
    int low = 0;
    int mid;
    // Method to return index of element in an int array: faster than for loops
    // OOG = O(log(n))
    // ARR MUST BE SORTED
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] < numQuery) {
				low = mid + 1;
			} else if (arr[mid] > numQuery) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
  }

  static int binSearchStr(String[] arr, String strQuery) {
    int high = arr.length - 1;
    int low = 0;
    int mid;
    // Method to return index of element in a String array: faster than for loops
    // OOG = O(log(n))
    // ARR MUST BE SORTED
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid].compareTo(strQuery) < 0) {
				low = mid + 1;
			} else if (arr[mid].compareTo(strQuery) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
