package sub8;

public interface RemoteContro {

	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp(); // abstract 키워드 생략
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
}
