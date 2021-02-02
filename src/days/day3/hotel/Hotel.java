/**
 * 
 */
package days.day3.hotel;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class Hotel {

	HashSet<Zimmer> zimmerListe;
	
	
	/**
	 * 
	 */
	public Hotel() {
		zimmerListe = new HashSet<>();
	}

	public boolean addZimmer(Zimmer z) {
		return zimmerListe.add(z);
	}

	public boolean belegeZimmer(int zimmerNr, int anzahlGaeste) {
		Iterator<Zimmer> itZimmer = zimmerListe.iterator();
		while (itZimmer.hasNext()) {
		System.out.println(itZimmer.next().getZimmerNummer());
		if(zimmerNr == itZimmer.next().getZimmerNummer()) {
			itZimmer.next().setBelegteBetten(1);
		}
		}
		return false;
	}

	public void gibZimmerFrei(int zimmerNr) {
		for (Zimmer zimmer : zimmerListe) {
			if (zimmer.getZimmerNummer() == zimmerNr) {
				zimmer.setBelegteBetten(0);
			}
		}
	}

	public void gibAlleZimmerFrei() {
		for (Zimmer zimmer : zimmerListe) {
			zimmer.setBelegteBetten(0);
		}
	}

	public void druckBelegung() {
		int tempAnzahl = 0;
		for (Zimmer zimmer : zimmerListe) {
			tempAnzahl += zimmer.getBelegteBetten();
		}
		
		System.out.println("Belegung: " + tempAnzahl);
	}

}
