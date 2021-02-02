/**
 * 
 */
package days.ueb;

/**
 * @author christianwalter
 *
 * @since 27.01.2021
 */
public class Konto {

	private String name;
	private double kontostand;
	private static int kundenanzahl=0;
	
	/**
	 * 
	 */
	public Konto(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		kundenanzahl += 1 ;
		kontostandNeuKunde();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " hat den kontostand " + getKontostand();
	}
	
	private void kontostandNeuKunde() {
		if(getKundenanzahl() == 0) {
			setKontostand(100);
		}else {
			setKontostand(100-(getKundenanzahl()*10) + 10);
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public static int getKundenanzahl() {
		return kundenanzahl;
	}

	public static void setKundenanzahl(int kundenanzahl) {
		Konto.kundenanzahl = kundenanzahl;
	}
	
	
	
	
}
