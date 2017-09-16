package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {
	
	@Override
	public String searchName() {
		return "LinearSearch";
	}

	@Override
	public int search(int[] arr, int target) {
		int end = arr.length - 1;
		
		for (int i = 0; i < end; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
}