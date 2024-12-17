import java.util.*;

class RemoveDublicateElement{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************************************\n");
		System.out.println("Enter a String !");
		String str = sc.next();
		System.out.println("\n*********************************************************");
		System.out.println(" Before Removing Dublicate : " + str);

		HashSet<Character> hp = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		for(char c : str.toCharArray()){
			if(!hp.contains(c)){
				hp.add(c);
				sb.append(c);
			}
		}
		System.out.println("\n*********************************************************\n");
		System.out.println(" After Removing Dublicate : " + sb.toString());
		System.out.println("\n*********************************************************");
	}
}