package arraysPractice;

import java.util.Scanner;

//Display Sum of even number from array
public class SumOfEvenNumber {
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
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of Even Number : " + sum);
	}
}
