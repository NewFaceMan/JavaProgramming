import java.util.Scanner;

public class Project6_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("영어 문장을 입력하시오.");
		String sentance = input.nextLine();
		
		System.out.println("수정된 문장은: ");
		int index = sentance.indexOf("Java"); // "Java" 서브 스트링의 시작 인덱스 찾기
		
		String substring1 = sentance.substring(0, index);
		String substring2 = sentance.substring(index).toUpperCase();
		System.out.println(substring1 + substring2);
		
		
		
		
	
		
		
		
	}
	
}
