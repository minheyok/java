package sub1;
/*
 * 날짜 : 2025/01/07
 * 이름 : 장민혁
 * 내용 : Java 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//car 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name ="소나타";
		sonata.color ="흰색";
		sonata.speed =0;
		
		// 객체 상호작용
		sonata.speedUp(100);
		sonata.speedDown(100);
		sonata.show();
		
		
		// 객체 선언
		Car avante;
		
		//객체 생성
		avante = new Car();
		
		//객체 초기화
		avante.name = "아반떼";
		avante.color = "흰색";
		avante.speed = 10;
		
		// 객체 상호작용
		avante.speedUp(70);
		avante.speedDown(20);
		avante.show();
		
		// Account 객체 생성
		
		Account kb =new Account();
		kb.bank ="국민은행";
		kb.id ="110-12-1101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(100000);
		kb.withdraw(50000);
		kb.show();
		
		Account wr =new Account();
		wr.bank ="우리은행";
		wr.id ="100-11-1021";
		wr.name ="김춘추";
		wr.balance =10000;
		
		wr.deposit(10000);
		wr.withdraw(5000);
		wr.show();
		
		 
		 
		 
		
		
				
				
	}
}
