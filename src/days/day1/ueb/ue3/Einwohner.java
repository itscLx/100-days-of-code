/**
 * 
 */
package days.day1.ueb.ue3;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Einwohner {

	public int einkommen;

	
	
	
	/**
	 * 
	 */
	public Einwohner() {
		this.einkommen = 20;
	}
	
	
	
	
	public int getSteuer() {
		if((getEinkommen() * 0.19)<5) {
			return 5;
		} else {
			return (int)Math.round(getEinkommen()*0.19);
		}
	}
	
	
	public int getZuVersteuerndesEinkommen() {
		return (int) Math.round(getEinkommen()*0.8);
	}
	
	
	/**
	 * GETTER AND SETTER 
	 */
	public int getEinkommen() {
		return einkommen;
	}

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
	
	
	
	
	
	
	
	
}
