/**
 * 
 */
package days.day1.ueb.ue3;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Koenig extends Einwohner {

	@Override
	public int getSteuer() {
		return (int)Math.round(getZuVersteuerndesEinkommen() * 0.1);
		
	}



	
}
