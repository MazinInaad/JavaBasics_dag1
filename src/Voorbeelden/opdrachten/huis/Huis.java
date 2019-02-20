package Voorbeelden.opdrachten.huis;

import deDeur.deur.Deur;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Huis {

	private List<Deur> deuren = new ArrayList<>();
	
	/**
	 * Ontwerp een nieuw huis met 3 deuren naar buiten toe:
	 * - Voordeur
	 * - Garagedeur
	 * - Achterdeur
	 */
	public Huis() {
		deuren.add(new Deur("Voordeur", 200, 70));
		deuren.add(new Deur("Garagedeur", 400, 220));
		deuren.add(new Deur("Achterdeur", 200, 70));
	}
	
	/**
	 * Haal het deur object van een bepaal type uit het huis.
	 * NB: Dit verwijdert niet de deur zelf
	 * 
	 * @param deurType het opgevraagde type
	 * @return de deur van dat specifieke type of geen deur
	 */
	public Deur getDeur(String deurType) {
		Deur result = null;
		for (int i = 0; i < deuren.size(); i++) {
			if (deuren.get(i).getType().equals(deurType)) {
				result = deuren.get(i);
			}
		}
		return result;
	}

	/**
	 * Toon de voorkant van het huis als plaatje.
	 */
	public void toon() {
		HuisBuilder huisBuilder = new HuisBuilder(this);
		BufferedImage image = huisBuilder.maakPlaatje();
		JFrame frame = new JFrame("Huis");
		frame.setContentPane(new JLabel(new ImageIcon(image)));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/**
	 * Maak een array met alle deur typen in het huis
	 * 
	 * @return alle typen in het huis
	 */
	public String[] getDeuren() {
		String[] result = new String[deuren.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = deuren.get(i).getType();
		}
		return result;
	}
	
}
