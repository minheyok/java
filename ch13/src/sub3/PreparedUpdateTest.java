package sub3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/*
 * 날짜 : 2025/01/23
 * 이름 : 장민혁
 * 내용 : Java CRUD 실습하기
 */

public class PreparedUpdateTest {
	
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2
		Connection conn = DriverManager.getConnection(host,user,pass);
			// 3
		String sql = "UPDATE `user1` SET `name` =?,`hp` =?,`age`=? ";
	           sql += "WHERE `uid`=?";
	           
	    PreparedStatement psmt = conn.prepareStatement(sql); 
	    	psmt.setString(1, "김성민");
	    	psmt.setString(2, "010-1234-1001");
	    	psmt.setInt(3, 24);
	    	psmt.setString(4, "a101");
	    	System.out.println(psmt);
			// 4
	    	psmt.executeUpdate();
	    
			// 5
			// 6
	    	psmt.close();
	    	conn.close();
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("Update 완료...");
	}

}
