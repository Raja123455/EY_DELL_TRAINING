package Class8;

import java.util.Optional;

public class UseOfOptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = new String[10];
		words[5] = "ABCDER";
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		
		if(checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
			
		}
		else {
			System.out.println("Word is null");
		}
	}

}