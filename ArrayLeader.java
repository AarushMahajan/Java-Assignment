package javaAssignment;

import java.util.Scanner;

public class ArrayLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]>=arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.print(arr[n-1]);

	}

}