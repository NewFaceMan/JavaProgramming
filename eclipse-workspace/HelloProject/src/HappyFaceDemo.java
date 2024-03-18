import javax.swing.JFrame;

public class HappyFaceDemo {

	public static void main(String[] args) {
		
		HappyFace happy = new HappyFace();
		happy.setTitle("Happy Face"); 
		happy.setSize(500, 500);
		happy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		happy.setVisible(true);

	}

}
