/**
 * 
 */
package days.day1.bsp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> krasseListe = new ArrayList<Integer>();
		krasseListe.add(12);
		krasseListe.add(47);
		krasseListe.add(69);
		krasseListe.add(20);
		
		Iterator<Integer> it = krasseListe.iterator();
		
		System.out.println("Ausgabe mit iterator");
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		
		
	}
	
	
}
