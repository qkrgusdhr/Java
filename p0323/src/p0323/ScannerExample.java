package p0323;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("x�� �Է� : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y�� �Է� : ");
		String strY  = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int res = x + y;
		System.out.println("x + y = " + res);
		System.out.println();
		
		
		
		while (true) {
			System.out.print("�Է� ���ڿ� : ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("��� ���ڿ� : " + data);
			System.out.println();
		}
		System.out.println("����");
		sc.close();
		
	}

}
