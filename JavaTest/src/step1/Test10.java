package step1;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		int c1 = (b%10)*a;
		int c2=(b/10)%10*a;
		int c3 = (b/100)*a;
		int sum = a*b;
		
		System.out.println(c1);
		System.out.println(c2);		
		System.out.println(c3);
		System.out.println(sum);
		
		
	}

}
