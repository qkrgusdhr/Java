package ByteExample;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("두 수를 입력하시오. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int mul = a*b;
		System.out.println(a+" + "+b+" = " + sum);
		System.out.println(a+" * "+b+" = " + mul);

		sc.close();
	}

}
