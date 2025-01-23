package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 장민혁
 * 내용 : Java JDBC 접속 테스트 실습하기 
 */

public class DeleteTest {
	
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String name = "root";
		String pass = "1234";
		
		// db정보
		try {
			
			//1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		
			//2단계
		
		Connection conn = DriverManager.getConnection(host,name,pass);
			//3단계
		Statement stmt = conn.createStatement();
			//4단계
			String sql = "DELETE FROM `user1` WHERE `uid`='j101'";
			stmt.execute(sql);
			//5단계
			//6단계
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("Delete완료...");
	}

}
