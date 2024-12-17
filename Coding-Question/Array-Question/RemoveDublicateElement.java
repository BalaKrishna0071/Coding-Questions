import java.util.*;


class RemoveDublicateElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println(" Enter Size of the Array ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("*****************************************");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements Before  Removing Dublicate Elements : ");

		for(int i = 0 ;i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n*****************************************");

		HashSet<Integer> hs = new HashSet<>();
		for(int num : arr){
			hs.add(num);
		}

		int[] demoArr = new int[hs.size()];
		int ind = 0;
		for(int num : hs){
			demoArr[ind++] = num;
		}
		System.out.println("After Removing Dublicate Elements : ");
		for(int i =0 ; i < hs.size(); i++){
			System.out.print(demoArr[i] + " ");
		}
		System.out.println("\n*****************************************");
	}
}