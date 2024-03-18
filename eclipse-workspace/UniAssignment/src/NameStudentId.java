import java.awt.Graphics;

import javax.swing.JFrame;

public class NameStudentId extends JFrame {
	public void paint(Graphics g) {
		
		g.drawOval(100, 70, 70, 70); // 우 자음
		g.drawLine(70, 160, 200, 160); // 우 모음
		g.drawLine(135, 160, 135, 210); // 우 모음
		
		g.drawLine(280, 70, 310, 70); // 칠 획 1
		g.drawLine(260, 90, 330, 90);	// 칠 획 2
		g.drawLine(330, 90, 260, 140);	// 칠 획 3
		g.drawLine(295, 115, 330, 140);	// 칠 획 4
		g.drawLine(360, 70, 360, 150);	//칠 획 5
		
		g.drawLine(280, 160, 350, 160);	//ㄹ 획 1
		g.drawLine(350, 160, 350, 185);	//ㄹ 획 2
		g.drawLine(350, 185, 280, 185);	//ㄹ 획 3
		g.drawLine(280, 185, 280, 210);	//ㄹ 획 4
		g.drawLine(280, 210, 350, 210);	//ㄹ 획 5
		
	}
	

}

