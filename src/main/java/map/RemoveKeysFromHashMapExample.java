package map;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeysFromHashMapExample {
	
	public static void main(String[] args) {
		
		Map<String, String> husbandWifeMapping = new HashMap<>();
		husbandWifeMapping.put("Jack", "Marie");
		husbandWifeMapping.put("Chris", "Lisa");
		husbandWifeMapping.put("Steve", "Jeniffer");
		
		System.out.println("Husband and Wife mapping: " + husbandWifeMapping);
		
		// Remove key from a map
		// Ex - unfortunately, Chris got divorced, let's remove him from the mapping
		String husband = "Chris";
		String wife = husbandWifeMapping.remove(husband);
		System.out.println("Couple (" + husband + " => " + wife + ") got divorced");
		System.out.println("New Mappgin: " + husbandWifeMapping);
		
		
		// Remove key from the HashMap only if it is mapped to the given value
		// Ex - Divorce "Jack" only if he is married to "Linda"
		boolean isRemoved = husbandWifeMapping.remove("Jack", "Linda");
		System.out.println("Did Jack get removed from the mapping? : " + isRemoved);
		
		
		// remove() returns null if mapping was not found for the supplied key
		wife = husbandWifeMapping.remove("David");
		if (wife == null) {
			System.out.println("Looks like David is not married to anyone!");
		}
		else {
			System.out.println("Removed David and his wife from the mapping");
		}
				
	}

}
