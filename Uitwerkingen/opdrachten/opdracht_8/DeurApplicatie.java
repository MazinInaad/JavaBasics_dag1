package opdrachten.opdracht_8;


import Voorbeelden.opdrachten.huis.Deur;

public class DeurApplicatie {

	public static void main(String[] args) {
		Deur deur = new Deur("Voorbeelddeur", 180, 50);
		deur.open();

		System.out.println(deur.isOpen());

		deur.sluit();
		System.out.println(deur.isOpen());

		deur.openMetHoek(-10 , false);
		System.out.println("Deur is open: "+ deur.isOpen() + " met hoek " + deur.getOpeningshoek());

		System.out.println(deur.getHoogte()* deur.getBreedte());
		System.out.println(deur.oppervlakte());

		System.out.println(deur.gewicht(3, 3.4));
	}

}
