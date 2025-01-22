package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2025/01/22
 * 이름 : 장민혁
 * 내용 : Java HTTP 통신 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {
		
		FileOutputStream fos = null; //FileOutputStream:파일에 데이터를 쓰기위해 사용하는 클래스
									//데이터를 바이트(byte)단위로 처리하고 텍스트나 바이너리 데이터를 파일에 저장할때 사용 
		
		BufferedReader br = null;	//BufferedReade:파일이나 스트림에서 데이터를 읽기위해 사용하는 클래스
									// 데이터를 한 줄씩 읽을수 있고 내부버퍼를 이용해 속도를 최적화함
		
			// 바이너리 데이터
			// 모든 데이터(이미지,영상,음악...)등 0과1로만 이루어진 이준수로 이루어져있다
		
		
		try {
			URL url = new URL("https://google.com"); // URL 객체 생성:google 사이트 URL을 지정
			
			try {
				br = new BufferedReader(new InputStreamReader(url.openStream())); // URL에서 입력 스트림을 열어서 데이터를 읽기 위한 BufferedReader 생성
				fos = new FileOutputStream("./result.txt"); //FileOutputStream:읽은 데이터를 result.txt"파일에 저장함
				
				String line = null;
						
				while((line = br.readLine()) != null) { //br.readLine():사용하여 한줄씩 읽고 그 줄을 출력하고 파일에 저장함
					System.out.println(line);			//!= null 이 조건은 파일의 끝에 도달할 때 까지 반복문을 실행시킴 // 파일에 끝에 도달하면 (readLine) 메서드는 null 을 반환시킴
					fos.write(line.getBytes());			// for=FileOutputStream 객체로 파일에 데이터를 쓰는 데 사용	
				}										//line.getBytes():문자열 line 을 바이트 배열로 변환
														//FileOutputStream:은 바이트 단위로 데이터를 처리 하므로 문자열을 바이트로 변환해야함
				
				br.close();		//close() 호출을 하면 해당 객체는 재사용 불가함
				fos.close();	//close() 호출을 하면 해당 객체는 재사용 불가함
				
			}catch (IOException e) {		//IOException e -- 일반적인 입출력 작업 중 발생하는 모든 예외를 포괄
				e.printStackTrace();		//예시--네트워크 연결실패,스트림 작업 실패,파일 시스템 문제 등..입출력 작업 중 발생할 수 있는 모든 문제(파일,네트워크,스트림 등 포함)
				//예외가 발생한 메서드와 파일 이름, 라인 번호를 순서대로 출력.
				//예외가 발생한 메서드에서 호출된 메서드를 추적해 나갑니다.

				
			}
			}catch (MalformedURLException e) {	//MalformedURLException e -- URL형식이 잘못되었을 때 발생하는 예외를 처리함
			e.printStackTrace();
			}
		
		System.out.println("HTTP 통신 종료...");
		
	}

}
