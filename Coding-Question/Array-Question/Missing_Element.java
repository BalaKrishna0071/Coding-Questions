import java.util.*;



class Missing_Element{
	
	public static void main(String args[]){
			

	   Scanner sc = new Scanner(System.in);
	   System.out.println(" Enter Size of the Array ");
	   int n = sc.nextInt();
	   int arr[] = new int[n];
	   System.out.println(" Enter Array Elements ");

	   for(int i = 0;i < n; i++){

	 	arr[i] = sc.nextInt();
	   }

	   System.out.println("*******************************************************");

	   for(int i = 0;i < n; i++){
		
		System.out.print(arr[i] + " ");

	   }
	   
	   int expectedSum = (n + 1)*( n + 2)/2;

	   int actualSum =0;

	   for(int num : arr){
	   	actualSum += num;
	   }

	   int missingNum = (expectedSum - actualSum);
	   System.out.println("\nThe missing number is: " + missingNum);

	   System.out.println("*******************************************************");

	}
}