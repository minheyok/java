package sub1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
 * 날짜 : 2025/01/22
 * 이름 : 장민혁
 * 내용 : Java HTTP 통신 실습하기
 */
public class HrrpClientTest {
	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest
								.newBuilder() //HttpRequst 객체를 생성하기 위한 빌더 객체를 반환하는 메소드
								.uri(URI.create("https://google.com"))//HttpRequest 의 빌더 메소드중 하나로 HTTP요청을 보낼 대생의 URL울 설정
								.GET()		// 이 메소드는 요청한 URL로부터 데이터를 가져오거나 조회하는 요청을 의미/Goolge 구글로부터 데이터를 조회 or 가져온다
								.build();   // 복잡한 객체를 단계적으로 생성하고 최종객체를 생성하는데 사용 마침표같은 역활이라 보면됨		
											//
			try {
				HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());
		//	httpClient.send:설정된 HTTP요청(request)을	서버로 보냄//			//HttpResponse.BodyHandlers.ofString() :응답 데이터를 문자열 형태로 처리)
				// response: 서버로부터 받은 응답(상태 코드와 본문 데이터)을 담고있음
				System.out.println("실행코드 : " + response.statusCode() ); //response.statusCode() 서버가 반환한 HTTP 상태코드를 출력합니다
				System.out.println("응답코드 : " + response.body());	//response.body() 서버 응답 본문(실제 데어터)를 출력
				
			} catch (IOException | InterruptedException e) { //예외처리:IOException(네트워크 문제나 서버에 요청을 보내는중 오류가 발생했을때)
				e.printStackTrace();						//InterruptedException:요청이 중단(interrupted)되었을때 예외가 발생하면 오류 메세지 출력
			}
			System.out.println("HTTP 통신 중...");
			
			
					
		
		
	}

}
