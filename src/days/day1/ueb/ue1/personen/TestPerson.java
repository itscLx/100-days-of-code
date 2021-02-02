/**
 * 
 */
package days.day1.ueb.ue1.personen;


import days.day1.ueb.ue1.Adresse;
import junit.framework.TestCase;

/**
 * @author christianwalter
 *
 * @since 31.01.2021
 */
public class TestPerson extends TestCase {


	public void testAdressenPerson() {
		Adresse adr1 = new Adresse("Gruener Weg", "12", "67434", "Neustadt/Weinstr.", "Rheinland-Pfalz", "Deutschland");
		Adresse adr2 = new Adresse("Ernst-Boehe-Str.", "4", "67059", "Ludwigshafen am Rhein", "Rheinlandpfalz", "Deutschland");
		
		
		Person p1 = new Person("Arthur", "Clarke", adr1);
		Person p2 = new Person("Peter", "Murda", adr2);
		Person p3 = new Person("Thomas", "Schüssler", new Adresse("Paul-Wittsack-Straße", "10", "68163", "Mannheim", "Baden-Würrtemberg", "Deutschland"));

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}
	
	
}
