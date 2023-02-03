package feb3Practice;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key) {
		int low = arr[0];
		int high = arr[arr.length-1];
		while(low != high) {
			int mid = (low + high) / 2;
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]){
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("Key not found");
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int pos = binarySearch(arr, 5);
		System.out.println(pos);
	}

}
