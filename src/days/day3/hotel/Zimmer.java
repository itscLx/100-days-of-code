/**
 * 
 */
package days.day3.hotel;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class Zimmer {

	int zimmerNummer, anzahlBetten, belegteBetten=0;
	
	
	/**
	 * 
	 */
	public Zimmer(int zimmerNr,int anzahlBetten) {
		// TODO Auto-generated constructor stub
		this.zimmerNummer = zimmerNr;
		this.anzahlBetten = anzahlBetten;
	}
	
	
	/**
	 * GETTER AND SETTER 
	 */
	public int getZimmerNummer() {
		return zimmerNummer;
	}

	public void setZimmerNummer(int zimmerNummer) {
		this.zimmerNummer = zimmerNummer;
	}

	public int getAnzahlBetten() {
		return anzahlBetten;
	}

	public void setAnzahlBetten(int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
	}

	public int getBelegteBetten() {
		return belegteBetten;
	}

	public void setBelegteBetten(int belegteBetten) {
		this.belegteBetten = belegteBetten;
	}
	
	
	
	
	
}
