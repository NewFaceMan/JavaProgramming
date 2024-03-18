import java.util.Scanner;

public class PyToSquareMeter {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		/* 인풋은 스캐너 클래스에 소속된 객체, new 연산자를 이용해서 객체 설정
		 * 객체 설정 이름은 내가 마음대로 바꿀 수 있음.
		 */
		
		System.out.println("평 수를 입력하세요.");
		int py = input.nextInt(); //평수는 정수니까 int 타입으로 선언
		double squareMeter;	// 제곱미터 단위로 환산한 값은 실수니까 double 타입으로 선언
		squareMeter = py * 3.305785; // 제곱미터 계산식 입력
		System.out.println(py + "평은 " + squareMeter + "제곱미터입니다."); //출력
	
	}

}
