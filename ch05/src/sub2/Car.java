package sub2;
/*
 * 날짜 : 2025/01/07
 * 이름 : 장민혁
 * 내용 : Java 클래스 실습하기
 */
public class Car {	
		//car 클래스 정의(설계)
		
		
		// 속성(멤버 변수)- 클래스 속성은 무조건 private 선언!
		private String name;
		private String color;
		private int speed;
		
		// 생성자- 캡슗화된 속성을 초기화하기 위한 클래스 이릅과 동일한 반환 타입이 없는 메서드
		public Car(String name,String color, int speed) {
			this.name =name;
			this.color=color;
			this.speed=speed;
			
		}
		
		
		// 기능(멤버 메서드) - 클래스 기능은 무저건 public 선언
		public void speedUp(int speed) {
			// 속성 speed 에 매개변수값 대입    /this 는 현재 클래스를 지칭
			this.speed += speed;
		}
		public void speedDown(int speed) {
			this.speed -= speed;
		
		}
		
		public void show() {
			System.out.println("차량이름:" + this.name);
			System.out.println("차량색상:" + this.color);
			System.out.println("현재속도:" + this.speed);
		
	}
		
		// Getter, Setter 정의(옵션)-캡슐화된 속성을 수정하기위한 메서드
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
			
			
			
		}
		
		
		
				
}
