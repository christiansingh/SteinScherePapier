package src;


public class Ausgabe {
	String[] ssp = {"Stein", "Schere", "Papier"};
	String[] lll = {"Luu", "Lee", "Lii"};
	String[] gm;
	public void Ausgabe (int spieler1, int spieler2, String erg, String gameMode) {
		if(gameMode == "ssp") {
			gm = ssp.clone();
		}
		else {
			gm = lll.clone();
		}
		
		switch(erg) {
		case "Tie":
			System.out.println("Spiel ging untentschieden aus");
			System.out.println("Beide Spieler haben " + gm[spieler1 -1] + " gewählt");
			break;
			
		case "Win":
			System.out.println("Spieler 1 hat gewonnen");
			System.out.println("Spieler 1 hat " + gm[spieler1 -1] + " gewählt");
			System.out.println("Spieler 2 hat " + gm[spieler2 -1] + " gewählt");
			break;	
			
		case "Loose":
			System.out.println("Spieler 1 hat verloren");
			System.out.println("Spieler 1 hat " + gm[spieler1 -1] + " gewählt");
			System.out.println("Spieler 2 hat " + gm[spieler2 -1] + " gewählt");
			break;	
		}
		
	}

}
