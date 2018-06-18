package wowoniu167.github.game;
/**
 * 游戏物体的父类
 * @author ThinkPad
 *
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	 Image image;
	 double x, y;
	 int speed;
	 int width, height;

	public void drawSeft(Graphics g) {
		g.drawImage(image, (int) x, (int) y, null);
	}

	public GameObject(Image image, double x, double y, int speed, int width, int height) {
		// TODO Auto-generated constructor stub
		this.image = image;
		this.x = x;
		this.speed = speed;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	public GameObject() {
		
	}
	public Rectangle getRect() {
		return new Rectangle((int) x, (int)y, width, height);
	}
}