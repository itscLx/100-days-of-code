/**
 * 
 */
package days.day4.bank;

/**
 * @author christianwalter
 *
 * @since 02.02.2021
 */
public class Bausparkonto extends Konto {
	private static double zinssatz;
	private double vertragssumme;
	private boolean summeErreicht;
	
	
	
	
	/**
	 * GETTER AND SETTER 
	 */
	public static double getZinssatz() {
		return zinssatz;
	}
	public static void setZinssatz(double zinssatz) {
		Bausparkonto.zinssatz = zinssatz;
	}
	public double getVertragssumme() {
		return vertragssumme;
	}
	public void setVertragssumme(double vertragssumme) {
		this.vertragssumme = vertragssumme;
	}
	public boolean isSummeErreicht() {
		return summeErreicht;
	}
	public void setSummeErreicht(boolean summeErreicht) {
		this.summeErreicht = summeErreicht;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nDie Vertragssumme liegt bei: " + getVertragssumme() + "\nDie Vertragssumme wurde erreicht: " + (isSummeErreicht()? "Ja":"Nein") + "\nDer aktuelle Zinssatz liegt bei: " + getZinssatz();
	}
	
	
	
	
}
