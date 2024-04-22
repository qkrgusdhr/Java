package localExample;
class E{
	void method() {
		class F{
			F(){}
			int field1;
			
			void method1() {
				System.out.println("class E - method() - class F - method1()");
			}
		}
		F f = new F();
		f.field1 = 7;
		System.out.println(f.field1);
		f.method1();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.method();
	}

}
