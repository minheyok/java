package ch02.sec02;

public class ByteExample {
	
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = -0;
		byte var4 = -128;
		byte var5 = 30;
		int var6 = 128;  // byte는 -128~127 까지의 정수만 사용가능 128이상일 경우는 int  or  long 를 사용한다..
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
