package src;


public class Spiel {
	
	/*public Spiel() {
		System.out.println("Du Idiot hast nichts eingegeben");
	}*/
	String erg;
	Ausgabe meineAusgabe = new Ausgabe();
	public Spiel(int spieler1, int spieler2) {
		//Wenn beide Spieler das gleiche gewählt haben
		if (spieler1 == spieler2) {
			erg = "Tie";
			//System.out.println("Tie");
		}
		else {
			if (spieler1 - spieler2 == -1 || spieler1 - spieler2 == 2) {
				//System.out.println("Win");
				erg = "Win";
			}
			else {
				//System.out.println("Loose");
				erg = "Loose";
			}
		}
		meineAusgabe.Ausgabe(spieler1, spieler2, erg, "lll");
	}

}
