package days.day0.ue3;



public class Koenigreich {

	
	public static Einwohner[] einwohnerA;
	
	/**
	 * Legt vier Einwohner unterschiedlichen Standes mit jeweils 20 Talern Einkommen
	 * an.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		 steuerbescheid(new Koenig(20));
		 steuerbescheid(new Adel(20));
		 steuerbescheid(new Bauer(20));
		 steuerbescheid(new Leibeigener(20));
		 koenigreichAnlege();
		 System.out.println("Steuern im Königreich: " + (steuernImKoenigreich()));
	}
	

	/**
	 * Gibt das zu versteuernde Einkommen fuer einen Einwohner aus
	 * 
	 * @param einwohner
	 *            Der Einwohner
	 * @param einkommen
	 *            Das Jahreseinkommen des Einwohners
	 */
	 static void steuerbescheid(Einwohner einwohner) {
	
	 System.out.println(einwohner.getClass().getSimpleName() +
	 ": Einkommen " + einwohner.einkommen +
	 ", zu versteuerndes Einkommen " + einwohner.getZuVersteuerndesEinkommen() +
	 ", Steuer " + einwohner.getSteuer());
	 }
	 
	 public static void koenigreichAnlege() {
			einwohnerA = new Einwohner[12];
			
			Koenig koenig = new Koenig(300);
			
			einwohnerA[0] = koenig;
			for(int i=1; i<=3;i++) {
				einwohnerA[i] = new Adel(100);//3 Variabeln zeigen auf ein Objekt
			}
			for(int i=4; i<=7;i++) {
				einwohnerA[i] = new Bauer(40);//4 Variabeln zeigen auf ein Objekt
			}
			for(int i=8;i<=11;i++) {
				einwohnerA[i] = new Leibeigener(50);//5 Variabeln zeigen auf ein Objekt
			}
	}
	 
	 
	public static int steuernImKoenigreich() {
		int summe = 0;
		for(int i = 0; i < einwohnerA.length; i++) {
			summe += einwohnerA[i].getSteuer(); 
		}
		return summe;
	}
	
	public static void name() {
		
	}
	 
}