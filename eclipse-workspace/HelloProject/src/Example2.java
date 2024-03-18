import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨 온도를 입력하시오 : ");
		int Fahrenheit = input.nextInt();
		
		int Celsius = (int) ((Fahrenheit - 32) / 1.8);
		
		System.out.println("화씨 " + Fahrenheit + "도는 " + "섭씨 " + Celsius + "도 입니다.");
		
		

	}

}
