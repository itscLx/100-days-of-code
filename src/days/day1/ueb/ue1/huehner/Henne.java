/**
 * 
 */
package days.day1.ueb.ue1.huehner;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class Henne {

	String name;
	Ei ei;
	

	
	
	/**
	 * @param name
	 * @param ei
	 */
	public Henne(String name, Ei ei) {
		super();
		this.name = name;
		this.ei = ei;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " mit Name " + getName() + " und " + ei.toString();
	}
	
	
	/**
	 * GETTER AND SETTER
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ei getEi() {
		return ei;
	}
	public void setEi(Ei ei) {
		this.ei = ei;
	}
	
	
	
	
	
	
}
