package Day5;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(123,"RAJA");
		hMap.put(123, null); //Second record with same ky will override first
		hMap.put(121,null);
		hMap.put(null, "Shashank");
		hMap.put(null, "Mahato");
		hMap.put(135,"Rana");
		//This is how we traverse map
		for(Map.Entry<Integer, String> m: hMap.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
	}

}
