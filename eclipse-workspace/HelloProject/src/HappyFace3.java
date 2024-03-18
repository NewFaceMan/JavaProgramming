import java.awt.Graphics;

import javax.swing.JFrame;

public class HappyFace3 extends JFrame {

	public void paint(Graphics g) {
		
		g.drawRect(0, 0, 500, 500);
		g.drawOval(90, 100, 300, 300); //얼굴 외형
		g.drawOval(190, 170, 15, 30); //왼쪽 눈 외형
		g.fillOval(190, 170, 15, 30); //왼쪽 눈 색칠
		g.drawOval(290, 170, 15, 30); //오른쪽 눈 외형
		g.fillOval(290, 170, 15, 30); //오른쪽 눈 색칠
		g.drawArc(170, 250, 150, 100, 180, 180); 
		/* 입 (x,y) : (170, 250), wide 100, high 180의 직사각형을
		 * 만든 후 그 안에 접하는 타원을 만든다. 그 후 180도에서 180도까지 원의 호를 사용한다.
		 */
		g.drawOval(230, 230, 30, 30); // 코 외형
		g.fillOval(230, 230, 30, 30); // 코 내부 색칠 
	}
	

}
