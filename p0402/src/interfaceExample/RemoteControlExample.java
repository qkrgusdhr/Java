package interfaceExample;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(false);
		
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("RemoteControl - turnOn()");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("RemoteControl - turnOff()");
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		rc2.turnOn();
		rc2.turnOff();
		
	}

}
