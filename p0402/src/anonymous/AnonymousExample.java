package anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous annoy = new Anonymous();
		annoy.field.wake();
		annoy.method1();
		annoy.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�.");
			}
			
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
			
		});
		
	}

}
