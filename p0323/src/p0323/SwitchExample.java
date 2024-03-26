package p0323;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		String num;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.print("숫자 입력 : ");
			num = sc.nextLine();
			switch (num) {
			case "1":
				System.out.println("1번이 나왔습니다.");
				break;
			case "2":
				System.out.println("2번이 나왔습니다.");
				break;
			case "3":
				System.out.println("3번이 나왔습니다.");
				break;
			case "4":
				System.out.println("4번이 나왔습니다.");
				break;
			case "5":
				System.out.println("5번이 나왔습니다.");
				break;
			case "6":
				System.out.println("6번이 나왔습니다.");
				break;
			case "q":
				System.out.println("종료");
				run = false;
			}

		}
		sc.close();

	}

}
