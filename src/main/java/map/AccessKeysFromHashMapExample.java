package map;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {

	public static void main(String[] args) {
		Map<String, String> userCityMapping = new HashMap<>();
		
		// Check if a HashMap is empty 
		System.out.println("is userCityMapping empty? " + userCityMapping.isEmpty());
		
		userCityMapping.put("Diego", "Maringá");
		userCityMapping.put("Bruna", "Londrina");
		userCityMapping.put("Loreniha", "Prado Ferreira");
		
		System.out.println("userCityMap hashMap: " + userCityMapping);
		
		// Find the size of a map
		System.out.println("He have the city information of " + userCityMapping.size() + " users");
		
		String username = "Bruna";
		
		// Check if a key exists in the hashMap 
		if (userCityMapping.containsKey(username)) {			
			// Get the value assigned to a given key in the hashMap
			String city = userCityMapping.get(username);
			System.out.println("Username: " + username + " lives in: " + city);			
		}
		else {
			System.out.println("City details not found for a username: " + username);
		}
		
		// Check if a value exists in a hashMap
		String city = "Maringá";
		if (userCityMapping.containsValue(city)) {			
			System.out.println("There is a user in the userCityMapping who lives in " + city);
        } else {
            System.out.println("There is no user in the userCityMapping who lives in " + city);
        }
		
		// Modify a value assigned to an existing key
		userCityMapping.put(username, "Porecatu");
		System.out.println(username + " moved to a new city " + userCityMapping.get(username) + ", New userCityMapping : " + userCityMapping);

		
		// The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));
		
	}
	
}
