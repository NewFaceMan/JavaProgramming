import javax.swing.JOptionPane;

public class Project4 {

	public static void main(String[] args) {
		
		String heightString = JOptionPane.showInputDialog("키를 입력하시오(cm)");
		double height = Integer.parseInt(heightString);
		
		String WeightString = JOptionPane.showInputDialog("체중을 입력하시오(kg)");
		double weight = Integer.parseInt(WeightString);
		
		double bmi = (weight / ((height / 100) * (height / 100)));
		JOptionPane.showMessageDialog(null, "BMI = " + bmi);
		
		System.exit(0);

		
		
		

	}

}
