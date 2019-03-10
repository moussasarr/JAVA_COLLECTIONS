package myProject;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

//Maps are (key, value) pairs
//They use the put method instead of add method

public class MapCollectionsDemo {

	public static void main(String[] args) {
		
		Map<String, String> stringMap = new HashMap<>();
		stringMap.put("name", "Moussa");
		stringMap.put("age", "29");
		stringMap.put("profession", "Software Engineer");
		stringMap.put("age", "30");
		
		Set<String> keys = stringMap.keySet();
		
		for(String key : keys) {
			System.out.println(key + ": " + stringMap.get(key));
		}
		
		
		


	}

}
