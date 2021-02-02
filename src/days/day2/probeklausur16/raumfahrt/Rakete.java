/**
 * 
 */
package days.day2.probeklausur16.raumfahrt;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class Rakete extends Raumfahrtausstattung{
	String kraftstoff;
	
	
	/**
	 * 
	 */
	public Rakete() {
		// TODO Auto-generated constructor stub
	}

	
	

	/**
	 * @param bezeichung
	 * @param ablaufjahr
	 */
	public Rakete(String kraftstoff,String bezeichung, int ablaufjahr) {
		super(bezeichung, ablaufjahr);
		// TODO Auto-generated constructor stub
		this.kraftstoff = kraftstoff;
	}




	/**
	 * GETTER AND SETTER 
	 */
	public String getKraftstoff() {
		return kraftstoff;
	}


	public void setKraftstoff(String kraftstoff) {
		this.kraftstoff = kraftstoff;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " mit der Bezeichung: " + getBezeichung() + " benutzt " + getKraftstoff() + " Kraftstoff. " + " Dies wird im Jahr " + getAblaufjahr() + " ablaufen.";
	
	}
	
	
	
}
