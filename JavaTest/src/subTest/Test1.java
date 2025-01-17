package subTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int) (Math.random()*10) +1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("--------------------");
			System.out.println("answer의 값을 맞춰 보세요");
			System.out.println("1~10 사이의 값을 입력하시오 : ");
			
			try {
				
				input = sc.nextInt();
				
				if(input < 0) {
					throw new Exception("음수는 입력할수 없습니다.");
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다. 숫자를 입력하세요");
				continue;
			}catch(Exception e) {
				System.out.println();
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하시오.");
			}else if (answer < input) {
				System.out.println("더 작은 수를 입력하시오.");
			}else {
				System.out.println("answer :" +answer);
				System.out.println("정답입니다.");
				System.out.println("시도횟수 : " +count+"번");
				
				break;
			}
			
		}while(true);
		
		System.out.println("프로그램이 정상 종료되었습니다.");

	}
}
