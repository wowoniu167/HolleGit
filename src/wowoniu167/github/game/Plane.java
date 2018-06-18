package wowoniu167.github.game;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {
	public void drawSelf(Graphics graphics) {
		graphics.drawImage(image, (int)x, (int)y, null);
		x++;
	}

	public Plane(Image image, double x, double y) {
		this.image = image;
		this.x = x;
		this.y = y;
	}
}
