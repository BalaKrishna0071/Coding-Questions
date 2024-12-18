


// Use modulo (%) to get the last digit and divide (/) to remove it from the number.
// Multiply the result so far by 10 and add the extracted digit.
// Ensure the reversed number stays within the 32-bit signed integer range.



import java.util.*;
class ReverseNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number ! ");
		int num = sc.nextInt();

		System.out.println(" Reverse Number is " + reverseNumber(num));
	}
	public static int reverseNumber(int n){
		int rev =0;

		while(n !=0){
			int digit = n % 10;
			rev = rev*10+digit;
			n = n /10;
		}
		return rev;
	}
}