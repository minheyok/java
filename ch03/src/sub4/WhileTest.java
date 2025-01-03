package sub4;

/*
 * 날짜 : 2025/01/03
 * 이름 : 장민혁
 * 내용 : Java 반복 While 실습하기
 */

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1부터 10까지 합
		
		int sum = 0;
		int k =1;
		
		while(k <= 10 ) {
		
			sum += k;
			k++;	
		}
		
			System.out.println("1부터 10까지 합 : " + sum);
		
		// do-whule                       // 1번이상 무조건 반복실행
			int tot =0;
			int i = 1;
			   			
			do {
				
				if(i % 2 == 0) {
					tot += i;
				}
				i++;
				
			}while(i <= 10 );                   
				
				System.out.println("1부터 10까지 짝수합 :" + tot);
		// break
		int unm = 1;
		while(true) {   //무한루프
			
			if(unm % 5 == 0 && unm % 7 == 0) {
				break; //반복문 탈출
				
			}
			unm++;
			
			
			
			
		}
		System.out.println("5와 7의 최소공배수 :" + unm);
		
				
				
				
		
		// continue
		int total = 0;
		int j = 0;
		
		while(j <= 10 ) {
			
		
		}
		
		
		
	}

}
