package sub2;

import java.util.Scanner;

public class Test5 {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h =sc.nextInt();  //시
		int m =sc.nextInt();  //분
		
		// m(분계산)
		m -= 45;		//분에서 -45분 
		if (m < 0) {	//m 에 주어진 함수가 -45 음수 이기때문에 0보다 작음
			m+=60;		//-45를 하면 음수가 나올수 있기때문에 60을 더해 양수로 변경
			h-=1;		//h(시)에서 -1를 한건 m(분) 에 60분 즉 1시간을 땡겨 온거기 때문에 -1를 적는다
		}	
		
		if (h < 0) {	// h(시) h 가 음수가 될경우  /현재 시간에서 하루를 되돌아 간것을 의미 24를 더하여 하루끝으로 이동
			h += 24;		// 하루의 끝으로 되돌아감(0~23시)에서 로테이션을 계속 돌림
		}
		
		System.out.println(h +" " + m);
	}
}
