/**
 * 
 */
package days.day2.probeklausur16.raumfahrt;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public abstract class Raumfahrtausstattung {
	String bezeichung;
	int ablaufjahr;

	
	
	
	/**
	 * 
	 */
	public Raumfahrtausstattung() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bezeichung
	 * @param ablaufjahr
	 */
	public Raumfahrtausstattung(String bezeichung, int ablaufjahr) {
		super();
		this.bezeichung = bezeichung;
		this.ablaufjahr = ablaufjahr;
	}

	/**
	 * GETTER AND SETTER 
	 */
	public String getBezeichung() {
		return bezeichung;
	}


	public void setBezeichung(String bezeichung) {
		this.bezeichung = bezeichung;
	}


	public int getAblaufjahr() {
		return ablaufjahr;
	}


	public void setAblaufjahr(int ablaufjahr) {
		this.ablaufjahr = ablaufjahr;
	}
	
	public abstract String toString();
	
	
	public String pruefeVerwendbarkeit() throws ZuAltFuerErneutenEinsatzException {
	
		if(getAblaufjahr() > 2016) {
			return getBezeichung() + " - OK";
		} else {
			throw new ZuAltFuerErneutenEinsatzException();
		}
		
	}
	
	
}
