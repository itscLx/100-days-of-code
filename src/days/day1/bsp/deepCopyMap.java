/**
 * 
 */
package days.day1.bsp;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class deepCopyMap {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, String> mapDeepCopy = new HashMap<String, String>();
		
		
		map.put("1", "Miriam");
		map.put("2", "Laurin");
		map.put("3", "Julian");
		map.put("4", "Christian");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String keyString = entry.getKey();
			String valString = entry.getValue();
			System.out.println(keyString + " " + valString);
		}
		
		String teString = "test";
		
		map.replace("1", teString);
		
		System.out.println("Vor dc");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
//			String keyString = entry.getKey();
//			String valString = entry.getValue();
			mapDeepCopy.put(entry.getKey(), entry.getValue());
		}
		
		
//		mapDeepCopy = dc(map);
		


		
		
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String keyString = entry.getKey();
			String valString = entry.getValue();
			System.out.println(keyString + " " + valString);
		}
		
		
		System.out.println("dc");
		
		for(Map.Entry<String, String> entry : mapDeepCopy.entrySet()) {
			String keyString = entry.getKey();
			String valString = entry.getValue();
			System.out.println(keyString + " " + valString);
		}
		
		System.out.println("nach ");
		
		
	}
	
	
	
	public static HashMap<String, String> dc(HashMap<String, String> map){
		HashMap<String, String> temp = new HashMap<String, String>();
		
		
		for(String currentKey: map.keySet()) {
			temp.put(currentKey, map.get(currentKey));
		}
		
		return temp;
	}
	
	
}
