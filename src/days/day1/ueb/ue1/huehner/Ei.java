/**
 * 
 */
package days.day1.ueb.ue1.huehner;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Ei {
	String farbe;
	double groesse;

	/**
	 * @param farbe
	 * @param groesse
	 */
	public Ei(String farbe, double groesse) {
		super();
		this.farbe = farbe;
		this.groesse = groesse;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " mit Farbe " + getFarbe() + " und Größe " + getGroesse();
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

}
