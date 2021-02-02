/**
 * 
 */
package days.day4.bank;

/**
 * @author christianwalter
 *
 * @since 02.02.2021
 */
public class Sparbuch extends Konto {
	private static double zinssatz;

	public static double getZinssatz() {
		return zinssatz;
	}

	public static void setZinssatz(double zinssatz) {
		Sparbuch.zinssatz = zinssatz;
	}
	
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + super.toString() + " und hat den zinssatz von " + getZinssatz();
	}

	@Override
	public boolean einzahlen(double betrag) {
		// TODO Auto-generated method stub
		return super.einzahlen(betrag);
	}

	@Override
	public double auszahlen(double betrag) {
		// TODO Auto-generated method stub
		
		if((betrag-getKontostand())<0) {
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
