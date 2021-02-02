/**
 * 
 */
package days.day1.ueb.ue1;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Adresse {

	String str, hnr, plz, stadt, bundesland, land;

	
	
	
	/**
	 * 
	 */
	public Adresse() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param str
	 * @param hnr
	 * @param plz
	 * @param stadt
	 * @param bundesland
	 * @param land
	 */
	public Adresse(String str, String hnr, String plz, String stadt, String bundesland, String land) {
		super();
		this.str = str;
		this.hnr = hnr;
		this.plz = plz;
		this.stadt = stadt;
		this.bundesland = bundesland;
		this.land = land;
	}

	
	
	private boolean liegtInRLP() {
		return getBundesland().toLowerCase()=="rheinland-pfalz"? true : false;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return getStr() + " " + getHnr() + "\n" + getPlz() + " " + getStadt() + "\n" + getBundesland() + "\n" + getLand();
	}

	/**
	 * GETTER AND SETTER
	 */
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getHnr() {
		return hnr;
	}

	public void setHnr(String hnr) {
		this.hnr = hnr;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getBundesland() {
		return bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	
	
	
	
	
	
}
