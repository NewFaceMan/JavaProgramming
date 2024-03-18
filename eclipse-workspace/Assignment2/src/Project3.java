import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키를 입력하시오(cm) : ");
		double height = input.nextInt();
		
		System.out.println("체중을 입력하시오(kg):");
		double weight = input.nextInt();
		
		double bmi = (weight / ((height / 100) * (height / 100)));
		
		System.out.println("체질량지수(BMI) = " + bmi);

	}

}
