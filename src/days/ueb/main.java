/**
 * 
 */
package days.ueb;

/**
 * @author christianwalter
 *
 * @since 27.01.2021
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Konto maierKonto = new Konto("H. Maier");
		Konto schmidtKonto = new Konto("G. Schmid");
		Konto test = new Konto("G. test");
		
		System.out.println(maierKonto);
		System.out.println(schmidtKonto);
	
		System.out.println(test);
		
	}

}
