package sub03;

/*
 *  날짜 : 2025/01/08
 *  이름 : 장민혁
 *  내용 : Java 클래스, 변수, 메섣드 실습하기
 */
public class IncrementTest {
	
	// 일반 변수
	private int num1;
	
	// 클래스 변수(정적 변수)
	private static int num2;
	
	public IncrementTest() {
		num1++;
		num2++;
		
		System.out.println("num1:" +num1);
		System.out.println("num2:" +num2);
	}

}
