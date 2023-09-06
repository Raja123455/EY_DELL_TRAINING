package Class9;

import java.util.regex.Pattern;

//[abc] - a or b or c

public class CharacterClassInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[amn]","a")); //true
		System.out.println(Pattern.matches("[amn]","aa")); //flase
		System.out.println(Pattern.matches("[amn]","m")); //true
		System.out.println(Pattern.matches("[amn]","mn")); //false
		
		//any character except a or m o nr
		System.out.println(Pattern.matches("[^amn]","z")); //true
		//any alphabet uppercase or lowercase
		System.out.println(Pattern.matches("[a-zA-z]","B")); //true
		//a through d or m through p
		System.out.println(Pattern.matches("[a-d[m-p]]","e")); //false
		
	}

}
