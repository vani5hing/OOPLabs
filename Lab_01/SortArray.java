import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = inp.nextInt(), s = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = inp.nextInt();
			s += arr[i];
		}
		Arrays.sort(arr);
		double aver = ((double) s)/n;
		System.out.println("Sorted array:\n" + Arrays.toString(arr));
        System.out.println("Sum: " + s);
        System.out.println("Average: " + aver);
	}
}
