package sub3;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
		
	}
	// 스헤드 간의 경합(Race Condition)을 해결하기 위해 상호배제(Mutext) 처리
	public synchronized void setNum() {
		
		// synchronized 동기화 블럭으로 임계영역 선정(동기화 잡업 처리) (동기화) 순서대로 처리됨 
		num++;												// (비동기화) 순서 상관없이 처리됨	
	}

}
