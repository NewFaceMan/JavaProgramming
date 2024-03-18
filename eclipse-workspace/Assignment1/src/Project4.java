import java.awt.Graphics;

import javax.swing.JFrame;

public class Project4 extends JFrame {
	public void paint(Graphics g) {
		g.drawRect(30, 50, 300, 400);
		g.drawOval(128, 130, 100, 100);	//머리
		g.drawOval(105, 231, 150, 150);	//몸통
		g.drawOval(170, 178, 15, 15);	//코 테두리
		g.fillOval(170, 178, 15, 15);	//코 내부 색칠
		g.drawArc(143, 140, 70, 70, 220, 100);	//입
		g.drawRect(150, 160, 15, 4);	//왼쪽 눈
		g.fillRect(150, 160, 15, 4);	//왼쪽 눈 내부 색칠
		g.drawRect(190, 160, 15, 4);	//오른쪽 눈
		g.fillRect(190, 160, 15, 4);	//오른쪽 눈 내부 색칠
	}
	

}
