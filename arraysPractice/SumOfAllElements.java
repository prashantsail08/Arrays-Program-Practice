package arraysPractice;

import java.util.Scanner;

//sum of all elements
public class SumOfAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
	 	int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of All Elements : " + sum);
	}
}
