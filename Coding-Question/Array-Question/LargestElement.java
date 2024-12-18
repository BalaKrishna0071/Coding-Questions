
// Initialize max to the smallest possible integer value.
// Iterate through the array and compare each element with max.
// Return or print the largest number stored in max.

import java.util.*;


class LargestElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("***************************************************");
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("***************************************************");
		// Displaying Array elements

		System.out.println(" Displaying Array Elements ");

		for(int i = 0;i < size; i++)
		{

			System.out.print(" "+arr[i]+" ");
		}

		System.out.println("\n***************************************************");

		int max = Integer.MIN_VALUE;

		for(int num : arr){
			if(num > max){
				max = num;
			}
		}

		System.out.println(" Maximum Element is : " + max);

		System.out.println("***************************************************");

	}
}