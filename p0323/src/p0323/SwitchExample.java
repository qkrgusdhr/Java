package p0323;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		String num;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.print("���� �Է� : ");
			num = sc.nextLine();
			switch (num) {
			case "1":
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case "2":
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case "3":
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case "4":
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case "5":
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			case "6":
				System.out.println("6���� ���Խ��ϴ�.");
				break;
			case "q":
				System.out.println("����");
				run = false;
			}

		}
		sc.close();

	}

}
