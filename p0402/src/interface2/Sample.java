package interface2;

class Outer {
	private int outVar = 10;
	private int outStaticVar = 20;
	
	class Inner{
		public void print() {
			System.out.println(outVar);
			System.out.println(outStaticVar);
		}
	}
}

public class Sample {
    public static void main(String[] args) {
    	Outer o = new Outer();
    	Outer.Inner i = o.new Inner();
    	
    	i.print();
    }
}