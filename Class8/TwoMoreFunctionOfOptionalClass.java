package Class8;

import java.util.Optional;

public class TwoMoreFunctionOfOptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[5];
		str[2] = "Optional class Updates are coming soon...";
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
	}

}
