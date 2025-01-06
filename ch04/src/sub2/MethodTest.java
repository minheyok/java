package sub2;
/*
 * 날짜 : 2025/01/06
 * 이름 : 장민혁
 * 내용 : Java 메서드 실습하기
 */
public class MethodTest {
	
	// main 메서드 : 자바 프로글매의 시작 메서드(진입점)
	public static void main(String[] args) {
		
		//메서드(호출)
		int y1 = fx(1);
		int y2 = fx(2);
		int y3 = fx(3);
		
		System.out.println("y1 :" +y1);
		System.out.println("y2 :" +y2);
		System.out.println("y3 :" +y3);
		
		// 지역변수와 메서드
		int t1 =sum(1, 10);
		int t2 =sum(1, 100);
		
		System.out.println("t1 :" + t1);
		System.out.println("t2 :" + t2);
		
	}   //main 메서드 종료
	
	// 메서드 정의
	// main 메서드에서 호출해야하기 때문에 main과 같이 static를 키워드를 맞춰줌
	
	public static int fx(int x) { //접근권한, 반환타입, 메서드명(매게변수)
		
		int y= 2*x+3;
		
		return y;
	}
		//메서드 정의
		public static int sum(int start, int end) {
			
			int tota1 =0; //지역변수 : 메서드내에 선언한 변수,메서드가 종료되면 변수 해제
			
			for(int k=start ; k<=end ; k++) {
				tota1 += k;
			}
			
			return tota1;	
	}
}
