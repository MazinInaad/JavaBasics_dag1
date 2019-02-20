package Voorbeelden.opdrachten.huis;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class DataReader {

	public BufferedImage read(File plaatjeFile) {
		try {
			return ImageIO.read(plaatjeFile);
		} catch (IOException e) {
			System.err.println("Kon het plaatje niet lezen uit: " + plaatjeFile.getAbsolutePath());
			System.err.println("Neem contact op met de docent");
			return null;
		}
	}

	private BufferedImage build(File plaatjeFile) {
		BufferedImage result = new BufferedImage(1000, 500, BufferedImage.TYPE_INT_RGB);
		if (plaatjeFile.getName().contains("voordeur")) {
			Graphics graphics = result.getGraphics();
			graphics.setColor(Color.WHITE);
			graphics.fillRect(0,  0, result.getWidth(), result.getHeight());
			graphics.setColor(Color.BLACK);
			graphics.fillRect(10, 10, 10, 10);
			return result;
		} else if (plaatjeFile.getName().contains("garagedeur")) {
			Graphics graphics = result.getGraphics();
			graphics.setColor(Color.WHITE);
			graphics.fillRect(0,  0, result.getWidth(), result.getHeight());
			graphics.setColor(Color.BLACK);
			graphics.fillRect(100, 50, 100, 100);
			return result;			
		} else {
			Random rnd = new Random();
			result = new BufferedImage(1000, 500, BufferedImage.TYPE_INT_RGB);
			for (int x = 0; x < result.getWidth(); x++) {
				for (int y = 0; y < result.getHeight(); y++) {
					result.setRGB(x, y, rnd.nextInt(0xFFFFFF));
				}
			}
		}
		return result;
	}

}
