/**
 * 
 */
package days.day4.bank.basics;

import java.util.Iterator;

/**
 * @author christianwalter
 *
 * @since 02.02.2021
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t = "test";
		String b = "tst";
		
		
		if(t== b) {
			System.out.println("true#");
		}else {
			System.out.println("false");
		}
		
		iteratortest<String> iteratortest = new iteratortest<>();
		
		iteratortest.add("test");
		iteratortest.add("Hallo");
		iteratortest.add("PENIS");
		
		
		Iterator<String> it = iteratortest.iterator();
		
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		
		
	}

}
