package chapter2;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하시오.");
		int i = keyboard.nextInt();
		int j = keyboard.nextInt();
		System.out.println("두 수의 곱은 = " + (i * j));
		
		System.out.println("두 개의 실수를 입력하시오.");
		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();
		System.out.println(" 두 수의 합은 = " + (x + y));
		
		System.out.println(" 두 개의 단어를 입력하시오.");
		String str1 = keyboard.next();
		String str2 = keyboard.next();
		System.out.println(str2 + " of " + str1);
	}

}

