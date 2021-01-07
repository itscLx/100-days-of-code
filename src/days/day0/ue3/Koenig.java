/**
 * 
 */
package days.day0.ue3;

/**
 * @author christianwalter
 *
 * @since 07.01.2021
 */
public class Koenig extends Einwohner {

	
	/**
	 * @param einkommen
	 */
	public Koenig(int einkommen) {
		super(einkommen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSteuer() {
		// TODO Auto-generated method stub
		return (int)Math.round(getZuVersteuerndesEinkommen() * 0.1);
	}
	
	
	
}
