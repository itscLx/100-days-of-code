/**
 * 
 */
package days.day2.probeklausur16.raumfahrt;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class Raumstation extends Raumfahrtausstattung implements HasDockingPortSystem{
	DockingPortSystem dockingPortSystem;

	
	/**
	 * 
	 */
	public Raumstation() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	/**
	 * @param bezeichung
	 * @param ablaufjahr
	 */
	public Raumstation(DockingPortSystem dockingPortSystem,String bezeichung, int ablaufjahr) {
		super(bezeichung, ablaufjahr);
		// TODO Auto-generated constructor stub
		this.dockingPortSystem = dockingPortSystem;
	}




	/**
	 * GETTER AND SETTER 
	 */
	public DockingPortSystem getDockingPortSystem() {
		return dockingPortSystem;
	}


	public void setDockingPortSystem(DockingPortSystem dockingPortSystem) {
		this.dockingPortSystem = dockingPortSystem;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return getClass().getSimpleName() + " mit der Bezeichung " + getBezeichung() + " wird im Jahr " + getAblaufjahr() + " ablaufen und besitzt \n" + getDockingPortSystem();
	}




	@Override
	public int getEntwicklungsjahr() {
		// TODO Auto-generated method stub
		return getEntwicklungsjahr();
	}




	@Override
	public void setEntwicklungsjahr(int entwicklungsjahr) {
		dockingPortSystem.entwicklungsjahr = entwicklungsjahr;
		
	}
	
	
	
}
