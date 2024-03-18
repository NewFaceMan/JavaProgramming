import java.awt.Graphics;

import javax.swing.JFrame;

public class Project3 extends JFrame {
	public void paint(Graphics g) {
		g.drawRect(60, 100, 660, 420);
		g.drawArc(60, 0, 600, 400, 210, 150);
		g.drawArc(60, 200, 600, 400, 0, 150);
		g.drawOval(140, 270, 60, 60);
		g.fillOval(150, 280, 40, 40);
		g.drawLine(660, 200, 660, 400);
	}

}
