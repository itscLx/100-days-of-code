package days.day0.ue2;

import java.util.Stack;

import days.day0.ue2.Kartenspiel;
import days.day0.ue2.Spielkarte;

public class Kartenstapel {
	
	/**
	 * Array vom Typ Spielkarte, welches alle Karten enthält die auf dem Stapel liegen
	 * Index: 0: unterste Karte; kartenA.length-1: oberste Karte
	 */
	Spielkarte[] kartenA;
	
	/**
	 * Konstruktor für einen leeren Kartenstapel
	 */
	public Kartenstapel() {
		kartenA = new Spielkarte[0];
	}
	
	/**
	 * Konstruktor für einen Kartenstapel mit genau einer Karte
	 */
	public Kartenstapel(Spielkarte karte) {
		kartenA = new Spielkarte[1];
		kartenA[0] = karte;
	}
	
	/**
	 * Konstruktur zur Generierung eines Kartenstapels aus dem gegebenen Kartenspiel
	 */
	public Kartenstapel(Kartenspiel spiel) {
		kartenA = new Spielkarte[spiel.getKartenAnzahl()];
		
		// kartenAA referenziert auf die im Spiel angelegten einzelnen Karten
		Spielkarte[][] kartenAA = spiel.getKartenAA();
		
		int index = 0;
		// mit kartenAA.length bekommen wir die Länge des äußeren Arrays 
		for(int i = 0; i < kartenAA.length; i++) {
			// mit kartenAA[0].length holen wir uns die Länge des inneren Arrays
			for(int j = 0; j < kartenAA[0].length; j++) {
				// hier wollen wir in dem Array kartenA die jeweilige Spielkarte abspeichern
				kartenA[index] = kartenAA[i][j];
				index++;
			}
		}
	}
	
	/**
	 * Legt die übergebene Karte auf den Kartenstapel
	 */
	public void push(Spielkarte newCard) {
		// ein um 1 größeres Array anlegen
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length + 1];
		
		// die bisherigen Karten in das neue Array kopieren
		System.arraycopy(kartenA, 0, kartenNeu, 0, kartenA.length);
		
		// die neue Karte auf den Stapel legen bzw. auf die letzte Position im neuen Array abspeichern
		kartenNeu[kartenNeu.length-1] = newCard;
		
		// den neuen Stapel der alten Objektvariablen zuweisen
		kartenA = kartenNeu;
	}
	
	public boolean empty() {
		if(kartenA.length==0) {
			return true;
		} else return false;
	}
	
	public Spielkarte pop() {
		Stack tempStack = new Stack<>();
		for(Spielkarte karte: kartenA) {
			tempStack.add(karte);
		}
		Spielkarte irgendwas = (Spielkarte) tempStack.pop();
		kartenA = (Spielkarte[]) tempStack.toArray();
		return irgendwas;
	}
	
	public Spielkarte top() {
		return kartenA[0];
	}
	
	public Spielkarte last() {
		return kartenA[kartenA.length-1];
	}
	
	public Spielkarte popRandomCard() {
		int randomInt =(int) Math.random() * kartenA.length;
		Stack tempStack = new Stack<>();
		for(Spielkarte karte: kartenA) {
			tempStack.add(karte);
		}
		Spielkarte random = (Spielkarte) tempStack.get(randomInt);
		tempStack.remove(randomInt);
		return random;
	}
	
	public boolean addKartenstapel(Kartenspiel kartenspiel) {
		
	}

}

