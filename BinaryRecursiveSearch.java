package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "BinaryRecursiveSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		return binaryRecursiveSearch(arr, 0, arr.length - 1, target);
	}
	
	public int binaryRecursiveSearch(int[] arr, int start, int end, int target) {
		int mid = (start + end) / 2;

		if (end < start) {
			return -1;
		}
		
		if (target == arr[mid]) {
			return mid;
		} else if (target < arr[mid]) {
			return binaryRecursiveSearch(arr, start, mid - 1, target);
		} else {
			return binaryRecursiveSearch(arr, mid + 1, end, target);
		}
	}

}
