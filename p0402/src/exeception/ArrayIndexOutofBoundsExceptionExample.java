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
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("실행에 문제가 있습니다.");
		}
		finally {
			// TODO: handle finally clause
			System.out.println("다시 실행하세요");
		}
		
	}

}
