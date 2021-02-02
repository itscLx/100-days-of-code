/**
 * 
 */
package days.day3.hotel;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class AppHotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h = new Hotel();
		
		h.addZimmer(new Zimmer(1,1));
		h.addZimmer(new Zimmer(2,2));
		
		
		h.belegeZimmer(2, 2);
		
		h.druckBelegung();
		
		
	}

}
