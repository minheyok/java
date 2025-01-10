package sub8;

public class RemoteSamsung implements RemoteContro {

	@Override
	public void powerOn() {
		System.out.println("Samsung - powerOn... ");
		
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
		System.out.println("chDowr");
		
	}

	@Override
	public void soundUp() {
		System.out.println("soundUP");
		
	}

	@Override
	public void soundDown() {
		System.out.println("soundDown");
		
	}

}
