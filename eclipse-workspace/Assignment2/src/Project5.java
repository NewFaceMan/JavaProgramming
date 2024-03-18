import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1000 미만의 양수를 입력하시오 : ");
		
		int result = input.nextInt();
		
		int price500 = result / 500;
		result %= 500;
		
		int price100 = result / 100;
		result %= 100;
		
		int price50 = result / 50;
		result %= 50;
		
		int price10 = result / 10;
		result %= 10;
		
		int price1 = result / 1;
		result %= 1;
		
		System.out.println("500원짜리: " + price500);
		System.out.println("100원짜리: " + price100);
		System.out.println("50원짜리: " + price50);
		System.out.println("10원짜리: " + price10);
		System.out.println("1원짜리: " + price1);
	
	}

}
