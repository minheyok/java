package sub2;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();	// 시  [0<=a<=23]
		int b =sc.nextInt();	// 분  [0<=b<=59]	 	
		int c =sc.nextInt();	// 시간 {0<=c<=1000}
		
		int q = a * 60 + b;
		int w = q+c;
		
		int e = (w/60)%24;
		int r =  w %60;
		
		System.out.println(e + " " +r);
		
		
		
		
			
		
		
		
	}
}
