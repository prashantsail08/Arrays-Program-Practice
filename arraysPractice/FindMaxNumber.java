package arraysPractice;

import java.util.Scanner;

public class FindMaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum/Highest Element : " + max);
	}
}
