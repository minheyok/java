package sub2;
/*
 * 날짜 : 2025/01/07
 * 이름 : 장민혁
 * 내용 : Java 클래스 캡슐화 실습하기
 */

public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		
		
		
	// Car 객체 생성 초기화
	Car sonata = new Car("소나타","흰색",10);
	
	
	// 캡슐화된 속성은 외부에서 참조할 수 없음
	//sonata.name = "소나타";
	//sonata.color = "흰색";
	//sonata.speed = 10;
	
	sonata.speedUp(60);
	sonata.speedDown(20);
	sonata.show();
	
	
	
		Car avante =new Car("아반테","검정",0);
		avante.speedUp(40);
		avante.speedDown(20);
		avante.show();
		
		avante.setColor("흰색");
		avante.show();
		/*
		 * Account 객체 생성 초기화(캡슐화 적용)
		 */
		 
		
		
		Account tr =new Account("국민은행","110-11-1011","김춘추",10000);
		tr.deposit(30000);
		tr.withdraw(250000);
		tr.show();
		
		tr.setName("유리은행");
		tr.show();
		
		
		
		
		
		
		
		
	}	

}
