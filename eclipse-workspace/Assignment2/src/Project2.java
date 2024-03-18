import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력하시오.");
		int Celsius = input.nextInt();
		int Fahrenheit = (int) ((Celsius * 1.8) + 32);
		
		System.out.println("섭씨 " + Celsius + "도는 " + "화씨 " + Fahrenheit + "도입니다.");
	}

}
