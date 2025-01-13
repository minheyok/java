package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2025/01/13
 * 이름 : 장민혁
 * 내용 : Java Throws 예외처리  실습하기
 */
public class ThorwsTest {
	
	public static void main(String[] args) {
		try {
			method1(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 정상 종료...");
	}
	
	
	public static void method1(int n1) {
		try {
			method2(n1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
				
	public static void method2(int n1) throws InputMismatchException,ArithmeticException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n2 입력 :");
		
		int n2 =scan.nextInt();
		int result = n1 / n2;
		
		System.out.println("result :" +result);
	}

}
