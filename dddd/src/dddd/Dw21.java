package dddd;

public class Dw21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 비교 연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 =var1 > var2;  //var1은 var2보다 크다
		boolean rs2 =var1 < var2; //var1은 var2보다 작다
		boolean rs3 =var1 >= var2; //var1은 var2보다 크거나 같다.
		boolean rs4 =var1 <= var2; // var1은 var2보다 작거나 같다
		boolean rs5 =var1 == var2; // var1은 var2보다 서로 같다
		boolean rs6 =var1 != var2; // var1은 var2보다 서로 다르다.
		
		System.out.println("rs1 :" + rs1);
		System.out.println("rs2 :" + rs2);
		System.out.println("rs3 :" + rs3);
		System.out.println("rs4 :" + rs4);
		System.out.println("rs5 :" + rs5);
		System.out.println("rs6 :" + rs6);
		
		// 논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3);// var3가 3보다크고 그리고 var4가 3보다크다.
		boolean res2 = (var3 > 2) && (var4 > 3);// var3는 2보다 크고 그리고 var4는 3보다 크다
		boolean res3 = (var3 > 3) || (var4 > 3);// var3는 3보다 크고 또는 var4는 3보다 크다.
		boolean res4 = (var3 > 3) || (var4 > 5);// var3가 3보다크고 그리고 var4가 5보다 크다
		boolean res5 = !(var3 > var4); //var3는 var4보다 크지 않다.
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
 
	
	}

}
