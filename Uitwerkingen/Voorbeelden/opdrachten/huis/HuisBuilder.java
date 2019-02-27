package Voorbeelden.opdrachten.huis;

import java.awt.image.BufferedImage;
import java.io.File;

public class HuisBuilder {

	private BufferedImage huisPlaatje;
	private BufferedImage garageDeurMask;
	private BufferedImage voorDeurMask;
	private Huis huis;

	public HuisBuilder(Huis huis) {
		File datafolder = new File("src/main/java/voorbeelden/opdrachten/huis");
		System.out.println("Pad naar de plaatjes: " + datafolder.getAbsolutePath());
		DataReader reader = new DataReader();
		huisPlaatje = reader.read(new File(datafolder, "huis.png"));
		voorDeurMask = reader.read(new File(datafolder, "voordeur.png"));
		garageDeurMask = reader.read(new File(datafolder, "garagedeur.png"));
		this.huis = huis;
	}

	public BufferedImage maakPlaatje() {
		BufferedImage result = new BufferedImage(huisPlaatje.getWidth(), huisPlaatje.getHeight(),
				huisPlaatje.getType());
		voorDeurMask.setRGB(0,  0,  huis.getDeur("Voordeur").getKleur().getRGB());
		garageDeurMask.setRGB(0,  0,  huis.getDeur("Garagedeur").getKleur().getRGB());
		result.setRGB(0,  0, huisPlaatje.getRGB(0, 0));
		for (int x = 1; x < huisPlaatje.getWidth(); x++) {
			for (int y = 1; y < huisPlaatje.getHeight(); y++) {
				int origRGB = huisPlaatje.getRGB(x, y);
				int resultRGB = applyMask(origRGB, x, y, voorDeurMask, garageDeurMask);
				result.setRGB(x, y, resultRGB);
			}
		}
		return result;
	}

	private int applyMask(int origRGB, int x, int y, BufferedImage... masks) {
		int resultRGB = origRGB;
		for (int i = 0; i < masks.length; i++) {
			int maskRGB = masks[i].getRGB(x, y);
			int colorRGB = masks[i].getRGB(0, 0);
			resultRGB = (resultRGB & maskRGB) | ((0x00FFFFFF ^ maskRGB) & colorRGB);
		}
		return resultRGB;
	}
	
}
