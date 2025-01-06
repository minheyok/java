package sub2;
/*
 * 날짜 : 2025/01/06
 * 이름 : 장민혁
 * 내용 : Java 메서드 타입 실습하기
 */
public class MethodTypeTesy { 
	
	public static void main(String[] args) {
	
		// 메서드 호출
	double y1 = type1(1.2); // 인자값 : 메서드를 홏풀할때 전달하는 값
	double y2 = type1(3.4);
	
	System.out.println("y1 :" +y1);
	System.out.println("y2 :" +y2);
	
	type2(true);  //반환값이 없기 때문에 메서드 옆에 대입연산(=) 없음
	type2(false);

	boolean result =type3();
	System.out.println("result :" +result);
	type4();
	
		
	}
	
	// 타입1 :매게변수 O 반환값 O
	public static double type1(double r) {
	
	double y = (r *r) + 3.14;
	  return y;
	}
	// 타입2 :매게변수 O 반환값 X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
		
	}
	// 타입3 :매게변수 X 반환값 O
	public static boolean type3() {
		int num1 =1;
		int num2 =2;
		
		if(num1 > num2) {
			return true;
		}else {
				return false;
			
		}
		
	}
	
		
	// 타입4 :매게변수 X 반환값 X
	public static void type4() {
		
		double result = type1(2.3);
		System.out.println("반지름 2.3인 ");
		
		
	}
}
