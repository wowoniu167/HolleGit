package wowoniu167.github.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

//import com.sun.glass.events.WindowEvent;
/**
 * 游戏主窗口
 * 
 * @author 叶立鹏
 */
public class MyGameFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	Image planeimg = GameUtil.getImage(" ");
	Image bg = GameUtil.getImage(" ");
	int planeX=250,planeY=250;
	Plane plane2 = new Plane(planeimg, 300, 300);
	/**
	 * 画图方法
	 */
	public void paint(Graphics g) {
		// Color c = g.getColor();
		// g.setColor(Color.BLUE);
		// g.drawLine(100, 100, 300, 300);
		// g.drawRect(100, 100, 300, 300);
		// g.fillRect(50, 50, 10, 10);
		// g.setColor(c);
		g.drawImage(bg, 0, 0, null);
		g.drawImage(planeimg, planeX, planeY, null);
		planeX++;
	}

	public void launchFrame() {
		this.setTitle("飞机游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		/**
		 * 窗口关闭事件监听
		 */
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
/**
 * 
 * @author ThinkPad
 *窗口重画，内部类
 */
	class PainThreed extends Thread {
		public void run() {
			while (true) {
				repaint();// 重画
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
