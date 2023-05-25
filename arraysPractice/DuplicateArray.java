package arraysPractice;

import java.util.Scanner;

public class DuplicateArray {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Size");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter Numbers");
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<n; i++)
	{
		int temp=0;
		int p=0;
		for(int j=i+1; j<n; j++)
		{
			if(arr[i]==arr[j])
			{
				p=1;
				arr[j]=0;
			}
		}
		if(p!=1 && arr[i]!=0)
		{
			System.out.println(arr[i]);
		}
		
	}
}
}
