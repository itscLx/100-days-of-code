/**
 * 
 */
package days.day4.bank;

/**
 * @author christianwalter
 *
 * @since 02.02.2021
 */
public class Girokonto extends Konto {

	private double kreditlimit;
	private static double ueberziehungszins;
	
	/**
	 * GETTER AND SETTER 
	 */
	public double getKreditlimit() {
		return kreditlimit;
	}
	public void setKreditlimit(double kreditlimit) {
		this.kreditlimit = kreditlimit;
	}
	public static double getUeberziehungszins() {
		return ueberziehungszins;
	}
	public static void setUeberziehungszins(double ueberziehungszins) {
		Girokonto.ueberziehungszins = ueberziehungszins;
	}
	
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + super.toString() + "\nSein Kreditlimit liegt bei: " + getKreditlimit() + "\nDer momentane Überziehungszins liegt bei: " + getUeberziehungszins();
	}
	@Override
	public boolean einzahlen(double betrag) {
		// TODO Auto-generated method stub
		return super.einzahlen(betrag);
	}
	@Override
	public double auszahlen(double betrag) {
		// TODO Auto-generated method stub
		if(betrag-getKreditlimit()<getKontostand()) {
			return 0;
		}else {
			setKontostand(getKontostand()-betrag);
			return betrag;
		}
		
		
	}
	@Override
	public double berechneZins() {
		// TODO Auto-generated method stub
		return super.berechneZins();
	}
	
	
	
	
	
}
