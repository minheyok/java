package sub03;

public class Calc {
	
	private static Calc instance = new Calc();
	
	public static Calc getInstanceTest( ) {
		return instance;
	}
	
	private Calc( ) {
		
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int mainus(int x,int y) {
		return x-y;
	}	
	public int multi(int x, int y) {
		return x*y;
	}
	public int div(int x, int y) {
		return x/y;
	} 
	

}
