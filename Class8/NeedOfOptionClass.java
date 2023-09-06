package Class8;

public class NeedOfOptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = new String[10];
		String word = "";
		if(null!=words[5]) {
		word = words[5].toLowerCase();
		} else {
			System.out.println("Value of 5th index was null");
		}
		
		System.out.println(word);

	}

}
