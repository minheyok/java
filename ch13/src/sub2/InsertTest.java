package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 장민혁
 * 내용 : Java JDBC 접속 테스트 실습하기 
 */
public class InsertTest {
		
	public static void main(String[] args) {
		
		// DB 정보
		final String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		final String USER = "root";
		final String PASS = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn =DriverManager.getConnection(HOST,USER,PASS);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "insert into `user1` value('j101','김유신','010-1234-1001',23)";
			stmt.execute(sql);
			
			// 5단계 - ResultSet
			
			// 6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("Insert 완료");
	}
	
}
