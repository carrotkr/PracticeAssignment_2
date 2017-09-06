package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "BinaryIterativeSearch";
	}

	@Override
	public int search(int[] arr, int target) {	
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = ((end - start) / 2) + start;
			
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
}
