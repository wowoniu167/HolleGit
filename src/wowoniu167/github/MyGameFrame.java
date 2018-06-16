package wowoniu167.github;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


//import com.sun.glass.events.WindowEvent;
/**
 * 游戏主窗口
 * @叶立鹏
 */
public class MyGameFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void  launchFrame() {
		this.setTitle("飞机游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
public static void main(String[] args) {
	MyGameFrame f = new MyGameFrame();
	f.launchFrame();
}
}
