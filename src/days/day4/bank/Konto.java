/**
 * 
 */
package days.day4.bank;


/**
 * @author christianwalter
 *
 * @since 02.02.2021
 */
public class Konto {
	private String name, adresse;
	protected double kontostand;
	
	
	
	
	
	
	public boolean einzahlen(double betrag) {
		return false;
	}
	
	public double auszahlen(double betrag) {
		return 0;
	}
	
	public double berechneZins() {
		return 0;
	}

	
	
	/**
	 * GETTER AND SETTER
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	
	
	@Override
	public String toString() {
		return "-" + getClass().getSimpleName() + " gehört " + getName() + ". Er ist ansässig in: \n" + getAdresse() + "\nEr hat momentan einen Kontostand von: " + getKontostand();
	}
	
	
}
