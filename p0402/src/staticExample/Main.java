package staticExample;

class C {
	static class D {
		D() {}

		int field1;
		static int field2;

		void method1() {
			System.out.println("class D - method1()");
		}
		static void method2() {
			System.out.println("2");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.D c = new C.D();
		c.field1 = 4;
		c.method1();
		System.out.println(c.field1);
		
		C.D.field2 = 5;
		System.out.println(C.D.field2);
		C.D.method2();
	}

}
