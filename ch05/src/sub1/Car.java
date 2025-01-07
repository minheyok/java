package sub1;
/*
 * 날짜 : 2025/01/07
 * 이름 : 장민혁
 * 내용 : Java 클래스 실습하기
 */
public class Car {
	
		
		//car 클래스 정의(설계)
		
		
		// 속성(멤버 변수)
		String name;
		String color;
		int speed;
		
		
		// 기능(멤버 메서드)
		public void speedUp(int speed) {
			// 속성 speed에 매개변수값 대입    /this는 현재 클래스를 지칭
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
}
