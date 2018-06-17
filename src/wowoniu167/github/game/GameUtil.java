package wowoniu167.github.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {
	private  GameUtil() {
		// TODO Auto-generated constructor stub
	}
	public static Image getImage(String path) {
		BufferedImage bi = null;
		try {
			URL url=GameUtil.class.getClassLoader().getResource(path);
			bi=ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return bi;
	}

}
