package opdrachten.opdracht_9;


import Voorbeelden.opdrachten.huis.Deur;
import Voorbeelden.opdrachten.huis.Huis;

public class DeurApplicatie {

	private Huis huis = new Huis();

	public static void main(String[] args) {
		new DeurApplicatie().run();
	}

	private void run() {
		Deur deur = huis.getDeur("Voordeur");
		huis.toon();
	}

}
