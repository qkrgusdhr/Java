package interface2;

public class Jetplane extends Plane implements Flyable, Soundable{
	
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("제트기 소리");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("제트기가 날아갑니다.");
	}
	
}