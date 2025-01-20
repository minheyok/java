package sub2;

/*
 * 날짜 : 2025/01/20
 * 이름 : 장민혁
 * 내용 : Java 스레드 상태 실습하기
 */
class WorkThread extends Thread {
	@Override
	public void run() {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("WorkThread..." + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e ) {
				e.printStackTrace();
			}
		}
		System.out.println("WorkThread 종료...");
	}
}


public class ThreadjoinTest {
	
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		// 스레드 실행
		work.start();
		
		// 스레드 종료대기
		try {
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인스레드 종료...");
	}

}
