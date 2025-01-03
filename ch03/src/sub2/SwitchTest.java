package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2025/01/02
 * 이름 : 장민혁
 * 내용 : Java switch 실습하기 
 */
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("숫자입력 :");
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		int numder = sc.nextInt();
		
		System.out.println("숫자입력 :" + numder);
		// 조건값의 결과에 따라 case별 실행흐름으로 분기
		switch(numder % 2) {
		
		case 0:
			
			System.out.println("numder는 짝수");
			 break;
			 
		case 1:
			System.out.println("numder는 홀수");
			 break;
			 
			default:
				System.out.println("numder는 숫자가 아님");
				break;
		
		}

	}

}
