package sub2;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
		
		
    Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 같은 눈 3개가 나온 경우
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }
        // 같은 눈 2개가 나온 경우
        else if (a == b || b == c || a == c) {
            int same = (a == b) ? a : (b == c) ? b : c;
            System.out.println(1000 + same * 100);
        }
        // 모두 다른 눈이 나온 경우
        else {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}