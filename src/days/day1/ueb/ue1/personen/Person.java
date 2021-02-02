/**
 * 
 */
package days.day1.ueb.ue1.personen;

import days.day1.ueb.ue1.Adresse;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Person {

	String vorname, nachname, beruf;
	boolean berufstaetig;
	int geburtsjahr;
	Adresse adresse;
	
	
	
	/**
	 * 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param vorname
	 * @param nachname
	 */
	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}



	/**
	 * @param vorname
	 * @param nachname
	 * @param adresse
	 */
	public Person(String vorname, String nachname, Adresse adresse) {
		this(vorname, nachname);
		this.adresse = adresse;
	}

	
	
	
	
	
	
	@Override
	public String toString() {
		return getVorname() + " " + getNachname() + "\n" + (isBerufstaetig()? getBeruf() : "Person ist nicht berufstätig\n") + (getGeburtsjahr()>1900? "Geboren im Jahr" + getGeburtsjahr() : "")+ "Adresse\n" + adresse.toString();
	}



	/**
	 * GETTER AND SETTER 
	 */
	public String getVorname() {
		return vorname;
	}



	public void setVorname(String vorname) {
		this.vorname = vorname;
	}



	public String getNachname() {
		return nachname;
	}



	public void setNachname(String nachname) {
		this.nachname = nachname;
	}



	public String getBeruf() {
		return beruf;
	}



	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}



	public boolean isBerufstaetig() {
		return berufstaetig;
	}



	public void setBerufstaetig(boolean berufstaetig) {
		this.berufstaetig = berufstaetig;
	}



	public int getGeburtsjahr() {
		return geburtsjahr;
	}



	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}



	public Adresse getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
	
}
