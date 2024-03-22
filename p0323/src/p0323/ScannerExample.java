package p0323;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력 : ");
		String strY  = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int res = x + y;
		System.out.println("x + y = " + res);
		System.out.println();
		
		
		
		while (true) {
			System.out.print("입력 문자열 : ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열 : " + data);
			System.out.println();
		}
		System.out.println("종료");
		sc.close();
		
	}

}
