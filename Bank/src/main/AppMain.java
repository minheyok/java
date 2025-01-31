package main;

import java.util.Scanner;

public class AppMain {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.println("========== Bank 프로젝트 ==========");
			System.out.println("0:종료, 1:고객등록, 2:계좌생성, 3:거래 내역 조회, 4:잔액 확인 및 입출금 처리");
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			switch (answer) {
			case 0:
				isRunning = false;
				break;
			case 1:
				// 고객등록
				
				break;
			case 2:
				// 계좌생성
				break;
			case 3:
				// 거래내역 조회
				break;
			case 4:
				// 잔액확인 및 입출금 처리
				break;
			default:
				System.out.println("다시 선택하세요");
				break;
				
			} //switch end
		} //while end
		sc.close();
		System.out.println("프로그램 종료...");
		
	} // main end
}
