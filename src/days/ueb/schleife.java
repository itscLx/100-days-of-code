/**
 * 
 */
package days.ueb;

/**
 * @author christianwalter
 *
 * @since 27.01.2021
 */
public class schleife {

	public static void main(String[] args) {
		
		String[][] personenStrings=
			{
					{"Meier", "Sepp", "Mannheim"},
					{"Huber", "Anton", "Regensburg"},
					{"Berger", "Franz", "Passau"},
					{"Winkler", "Hans", "Regensburg"},
					{"Maler", "Host", "Passau"}
			};
		
		
		for(int i = 0; i < personenStrings.length; i++) {
			System.out.println(personenStrings[i][1]);
		}
	}
	
	
	
}
