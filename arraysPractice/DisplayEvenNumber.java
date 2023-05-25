package arraysPractice;

import java.util.Scanner;

//Display only even number from array
public class DisplayEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even Number is : " + arr[i]);
			}
		}
	}
}
