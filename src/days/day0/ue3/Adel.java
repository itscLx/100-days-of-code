/**
 * 
 */
package days.day0.ue3;

/**
 * @author christianwalter
 *
 * @since 07.01.2021
 */
public class Adel extends Einwohner {

	
	
	/**
	 * @param einkommen
	 */
	public Adel(int einkommen) {
		super(einkommen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSteuer() {
		// TODO Auto-generated method stub
		if((super.getSteuer()>=20)){
			return super.getSteuer();
		} else {
			return 20;
		}
	}
	
}
