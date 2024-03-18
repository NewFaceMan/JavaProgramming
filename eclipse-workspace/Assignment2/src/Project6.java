import java.util.Scanner;

public class Project6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("영어 문장을 입력하시오.");
		String sentance = input.nextLine();
		
		
		String result1 = sentance.substring(0, 22);
		String result2 = sentance.substring(23).toUpperCase();
		System.out.println("수정된 문장은: ");
		System.out.println(result1 + " " + result2);
		
		
	
		
		
		
	}
	
}
