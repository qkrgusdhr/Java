package exeception;

public class ArrayIndexOutofBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + data2 + " = " + result);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		}
		finally {
			// TODO: handle finally clause
			System.out.println("�ٽ� �����ϼ���");
		}
		
	}

}
