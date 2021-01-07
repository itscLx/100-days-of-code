/**
 * 
 */
package days.day0.ue3;

/**
 * @author christianwalter
 *
 * @since 07.01.2021
 */
public class Leibeigener extends Bauer {

	/**
	 * @param einkommen
	 */
	public Leibeigener(int einkommen) {
		super(einkommen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSteuer() {
		
		if(getEinkommen()>12) {
			setEinkommen(getEinkommen()-12);
			return super.getSteuer();
		}else {
			return 0;
		}
		
	}
	
	
	
}
