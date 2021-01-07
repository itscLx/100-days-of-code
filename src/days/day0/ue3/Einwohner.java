/**
 * 
 */
package days.day0.ue3;

/**
 * @author christianwalter
 *
 * @since 07.01.2021
 */
public class Einwohner {
	int einkommen;
	
	
	/**
	 * 
	 */
	public Einwohner(int einkommen) {
		// TODO Auto-generated constructor stub
		this.einkommen = einkommen;
	}
	
	public int getZuVersteuerndesEinkommen() {
		return (int)Math.round(getEinkommen() * 0.8);
	}
	
	public int getSteuer() {
//		return ((int)Math.round(getZuVersteuerndesEinkommen()*0.19)<5)? 5 : (int)Math.round(getZuVersteuerndesEinkommen()*0.19);
		if(getZuVersteuerndesEinkommen()*0.19 < 5) {
			return 5;
		} else {
			return (int)Math.round(getZuVersteuerndesEinkommen()*0.19);
		}
	}

	
	
	/**
	 * GETTER UND SETTER 
	 */
	public int getEinkommen() {
		return einkommen;
	}

	public void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
	
	
	
	
	
}