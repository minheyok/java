package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
* 날짜 : 2025/01/15
* 이름 : 장민혁
* 내용 : Java 컬렉션 Set 실습하기
*/
public class SetTest {
	
	public static void main(String[] args) {
		
		
		// Set 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		//박복자(Iterator) 데이터 출력
		Iterator<Integer>  it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());

		}
		
		// 박복문으로 데이터 출력
		
		for(int num : set) {
			System.out.println(num);
		}
		
		
		
		
		
	}
}
