package opdrachten.opdracht_9;


import Voorbeelden.opdrachten.huis.Deur;
import Voorbeelden.opdrachten.huis.Huis;

import java.awt.*;

public class DeurApplicatie {

	private Huis huis = new Huis();

	public static void main(String[] args) {
		new DeurApplicatie().run();
	}

	private void run() {
		Deur voordeur = huis.getDeur("Voordeur");
		voordeur.beschilder(Color.BLUE);
		huis.toon();
	}

}
