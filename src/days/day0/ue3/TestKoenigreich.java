/**
 * 
 */
package days.day0.ue3;

import junit.framework.TestCase;

/**
 * @author christianwalter
 *
 * @since 07.01.2021
 */
public class TestKoenigreich extends TestCase {

	
	public void getZuVerSteuerndesEinkommenTest() {
		Einwohner einwohner = new Einwohner();
		einwohner.setEinkommen(4);
		assertEquals(5, einwohner.getZuVersteuerndesEinkommen());
	}
	
	
}
