/**
 * 
 */
package days.day1.ueb.ue3;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Adel extends Einwohner {

	@Override
	public int getSteuer() {
		if((getZuVersteuerndesEinkommen()*0.19)<20) {
			return 20;
		} else {
			return (int)Math.round(getZuVersteuerndesEinkommen()*0.19);
		}
		
	}


	
	
	
}
