// Isomorphic Strings refers to the concept of determining whether two strings can be transformed into each other by replacing characters consistently.
// Two strings are isomorphic if the characters in one string can be replaced to get the other string, with the condition that:
// Each character in the first string maps to exactly one character in the second string.
// No two characters in the first string map to the same character in the second string (one-to-one mapping).

// example :

// String s = "paper";
// String t = "title";
// String s1 = "egg", t1 = "add";
// String s2 = "foo", t2 = "bar";


import java.util.*;


public class Isomorphic {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter First  String ! ");
		String str1 = sc.next();
		System.out.println(" Enter Second  String ! ");
		String str2 = sc.next();
		System.out.println(" String One " + str1 );
		System.out.println(" String Two "+ str2 );

		System.out.println(isIsomorphic(str1,str2));


	}

	public static boolean isIsomorphic(String s1, String s2){

		if(s1.length() != s2.length()){
			return false;
		}

		HashMap<Character,Character> mapS = new HashMap<>();
		HashMap<Character,Character> mapT = new HashMap<>();


		for(int i = 0; i < s1.length(); i++){
			char char1 = s1.charAt(i);
			char char2 = s2.charAt(i);

			if(mapS.containsKey(char1)){

				if(mapS.get(char1) != char2){
					return false;
				}
			}else{
				mapS.put(char1, char2);
			}

			if(mapT.containsKey(char2)){

				if(mapT.get(char2) != char1){
					return false;
				}
			}else{
				mapS.put(char2, char1);
			}

		}
		return true;

	}
	
}
