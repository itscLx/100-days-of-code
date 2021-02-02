/**
 * 
 */
package days.day2.probeklausur16.raumfahrt;

import days.day1.bsp.iterator;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class Raumfahrttechnologie {
	Inventar<Traegersystem> traegerSystems = new Inventar<>();
	Inventar<Raumstation> raumStation = new Inventar<>();
	

	
	
	public Raumfahrttechnologie(Object o) {
		if(o instanceof Traegersystem) {
			this.traegerSystems.add((Traegersystem)o);
		}else if(o instanceof Raumstation) {
			this.raumStation.add((Raumstation)o);
		} else {
			System.out.println("Das Object gehört nicht zur Raumfahrtaustattung");
		}
	}
	
	
	/**
	 * @param traegerSystems
	 * @param raumStation
	 */
	public Raumfahrttechnologie(Traegersystem traegerSystems,Raumstation käse) {
		super();
		this.traegerSystems.add(traegerSystems);
		this.raumStation.add(käse);
	}
	
	
}
