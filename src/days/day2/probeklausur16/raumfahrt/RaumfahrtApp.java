/**
 * 
 */
package days.day2.probeklausur16.raumfahrt;

/**
 * @author christianwalter
 *
 * @since 01.02.2021
 */
public class RaumfahrtApp {
	public static <E> void main(String[] args) {
		
		DockingPortSystem amerikanischesDockingPort = new DockingPortSystem(1968, "amerikanischesDockingPort", 2030);
		
		DockingPortSystem russischesDockingPort = new DockingPortSystem(1985, "ROSKOSMOS-System", 1989);
		
		Traegersystem spaceShuttle = new Traegersystem(amerikanischesDockingPort, "Space Shuttle", 2010);
		
		Raumstation iSS = new Raumstation(amerikanischesDockingPort, "Internationale Raumstation", 2030);
		
		Traegersystem buran = new Traegersystem(russischesDockingPort, "Buran", 2004);
		
		Raumstation mIR = new Raumstation(russischesDockingPort, "MIR", 2001);
		
		Rakete apollo = new Rakete("fest", "Apollo", 2030);
		
		apollo.setKraftstoff("flüssig");
		
		
		try {
			buran.pruefeVerwendbarkeit();
		} catch (ZuAltFuerErneutenEinsatzException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		Raumfahrttechnologie nasaBestand = new Raumfahrttechnologie(spaceShuttle, iSS);
		
		Inventar<Object> gesamteRaumfahrtausstattung = new Inventar<>();
		
		gesamteRaumfahrtausstattung.add(amerikanischesDockingPort);
		gesamteRaumfahrtausstattung.add(russischesDockingPort);
		gesamteRaumfahrtausstattung.add(spaceShuttle);
		gesamteRaumfahrtausstattung.add(iSS);
		gesamteRaumfahrtausstattung.add(buran);
		gesamteRaumfahrtausstattung.add(mIR);
		gesamteRaumfahrtausstattung.add(apollo);
		
		
		for (Object raumfahrtausstattung : gesamteRaumfahrtausstattung) {
			if(raumfahrtausstattung instanceof DockingPortSystem) {
				System.out.println(((DockingPortSystem) raumfahrtausstattung).getEntwicklungsjahr());
			}
		}
		
		
	}
	
	/**
	 * Durch equals können Objekte verglichen werden. 
	 * Bei "==" werden nur Datentypen verglichen und ist bei Objekten fehl am platz.
	 */
	public static boolean isTheSame (Object object1, Object object2) {
		if(object1.equals(object2)) {
			System.out.println(object1.getClass().getSimpleName() + " und " + object2.getClass().getSimpleName() + " sind gleich.");
			return true;
		}else {
			System.out.println(object1.getClass().getSimpleName() + " und " + object2.getClass().getSimpleName() + " sind NICHT gleich.");
			return false;
		}
	}

}
