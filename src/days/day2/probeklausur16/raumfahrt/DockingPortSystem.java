/**
 * 
 */
package days.day2.probeklausur16.raumfahrt;

import java.security.PublicKey;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class DockingPortSystem extends Raumfahrtausstattung{

	int entwicklungsjahr;
	
	/**
	 * 
	 */
	public DockingPortSystem() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param bezeichung
	 * @param ablaufjahr
	 */
	public DockingPortSystem(int entwicklungsjahr ,String bezeichung, int ablaufjahr) {
		super(bezeichung, ablaufjahr);
		// TODO Auto-generated constructor stub
		this.entwicklungsjahr = entwicklungsjahr;
	}






	/**
	 * GETTER AND SETTER 
	 */
	public int getEntwicklungsjahr() {
		return entwicklungsjahr;
	}

	public void setEntwicklungsjahr(int entwicklungsjahr) {
		this.entwicklungsjahr = entwicklungsjahr;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return getClass().getSimpleName() + " mit der Bezeichung: " + getBezeichung() + " wurde im Jahr " + getEntwicklungsjahr() + " entwickelt und läuft im Jahr " + getAblaufjahr() + " ab.";
		
	}
	
	
	
	
}
