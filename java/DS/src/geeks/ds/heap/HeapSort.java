// Reference: http://www.geeksforgeeks.org/heap-sort/

package geeks.ds.heap;

import java.util.Scanner;

public class HeapSort {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ar[] = new int[n];
		for (int i =0; i < n ; i++)
			ar[i]=scanner.nextInt();

		sort(ar);

		for (int i =0; i<n; i++)
			System.out.print(ar[i] + " ");
	}

	private static void sort(int[] ar) {
		buildMaxHeap(ar);
		int n =ar.length;
		for(int i=n-1;i>=0;i--){
			swap(ar, 0 , i);
			heapify(ar,i, 0);
		}
	}

	private static void buildMaxHeap(int[] ar) {
		int n =ar.length;
		for(int i = n/2 -1; i>=0;i--)
			heapify(ar, n, i);
	}

	private static void heapify(int[] ar, int n, int i) {
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = i;

		if (left<n && ar[left] > ar[largest])
			largest = left;
		if (right<n && ar[right] > ar[largest])
			largest = right;

		if (largest != i){
			swap(ar,i,largest);
			heapify(ar, n, largest);
		}
	}

	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
