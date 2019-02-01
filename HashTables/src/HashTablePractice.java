import java.util.Hashtable;
import java.util.Enumeration;

public class HashTablePractice {

	public static void main(String[] args){
		
		Enumeration names;
		String key;
		
		//Create a hashtable
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		//Add key/value pairs to the table
		
		hashtable.put("Key1", "Monique");
		hashtable.put("Key2", "Tammy");
		hashtable.put("Key3", "Jon");
		hashtable.put("Key4", "Barb");
		hashtable.put("Key5", "Minnie");
		
		names = hashtable.keys();
		
		//cycle through keys, casting them to strings as the Inumerator interface 
		//returns them, and print out their key/value pairs by
		//passing the keys into the get function of the hashtable
		while(names.hasMoreElements()) {
			key =  (String) names.nextElement();
			System.out.println("Key: " + key + " Value: " + hashtable.get(key));
		}
	}
}
