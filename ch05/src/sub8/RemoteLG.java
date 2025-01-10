package sub8;

public class RemoteLG implements RemoteContro {

	@Override
	public void powerOn() {
		System.out.println("LG - powerOn... ");
		
	}

	@Override
	public void powerOff() {
		System.out.println("powerOff");
		
	}

	@Override
	public void chUp() {
		System.out.println("chUp");
		
	}

	@Override
	public void chDown() {
		System.out.println("chDown");
		
	}

	@Override
	public void soundUp() {
		System.out.println(":sounUp");
		
	}

	@Override
	public void soundDown() {
		System.out.println(":sounDown");
		
		
	}

}
