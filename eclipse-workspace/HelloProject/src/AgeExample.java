import java.time.LocalDate;
import java.util.Scanner;

public class AgeExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신이 태어난 연도는? ");
		int birthYear = input.nextInt();
		
		LocalDate date = LocalDate.now();
		int thisYear = date.getYear();
				
		int age = thisYear - birthYear;
		System.out.println("당신은 " + age + "살입니다." );
;		
		
	}

}
