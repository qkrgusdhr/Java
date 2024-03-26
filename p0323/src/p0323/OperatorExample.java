package p0323;

public class OperatorExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int sum1 = x * y;
		long sum2 = (long)x * (long)y;
		long sum3 = (long)sum1;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		

	}

}
