package Day_2_Assignments;

/**
 * initialize a single dimension array and sort it in ascending order.
 * 
 * 
 **/
public class Array {

	public static void main(String[] args) {
		int arr[] = { 8, 12, 6, 58, 14, 32 };
		int temp;
		System.out.println("Before Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\nAfter Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
