import java.awt.Graphics; // Ctrl + shift + o 자동 import

import javax.swing.JFrame;

public class FishFrame extends JFrame {
	
	public void paint(Graphics g) { // g : 매개변수 , 메서드는 단독으로 불리지 않는다. 메서드를 부를 수 있는 정보를 컴파일러에 줘야 함.
	
		g.drawRect(30, 50, 330, 210); // x,y로 시작점을 정의하고 직사각형을 만든다.
		g.drawArc(30, 0, 300, 200, 210, 150); //x,y로 시작점을 정의하고 직사각형을 만든 뒤 내가 시작할 각도, 표시할 각도를 넣는다.
		g.drawArc(30, 100, 300, 200, 0, 150);
		g.drawOval(70, 135, 30, 30); //직사각형을 정의하고 그 안에 들어가는 타원을 그릴 수 있음. 원은 정사각형을 정의하면 된다.
		g.fillOval(75, 140, 20, 20);
		g.drawLine(330, 100, 330, 200); // (x1, y1)부터  (x2, y2) 까지 있는 선	
	}

}
