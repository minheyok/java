package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2025/01/16
 * 이름 : 장민혁
 * 내용 : Java 파일 입출력 버퍼 스트림 실습하기
 */
public class BufferIOTest {
	
	public static void main(String[] args) {
		
		// 파일 경로 설정
		String source = "C:\\Users\\iotte6\\Desktop\\Samole1.trf";
		String target = "C:\\Users\\iotte6\\Desktop\\Samole2.trf";
		
		// 스티림 생성
		try {
			FileInputStream fis = new FileInputStream(source);              //입력
			FileOutputStream fos = new FileOutputStream(target);            //출력
			
			// 보조 스트림 생성 후 기본 스트립 연결
			BufferedInputStream  bis = new  BufferedInputStream(fis); 
			BufferedOutputStream bos = new  BufferedOutputStream(fos); 
			 
			
			// 스트림 데이터 전송
			while(true) {
				// 인력스트림으로 파일 데이터 읽기
				int	data = fis.read();
				
				if(data == -1) {
					//읽음 파일 데이터가 없을때
					break;
				}
				// 숫자를 문자로 변환
				//char ch = (char) data;
				//System.out.print(ch);
				
				// 출력스트림으로 파일 데이터 쓰기
				fos.write(data);
			}
			
			// 스트림 해제
			fis.close();
			fos.close();
			
			bis.close();
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
