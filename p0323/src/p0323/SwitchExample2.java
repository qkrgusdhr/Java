package p0323;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[2];
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) 
			num[i] = sc.nextInt();
			if (num[idx+1] > num[idx]) {
				System.out.printf("�Է¹��� �� �� ū ���� %d�̰� ���� ���� %d�Դϴ�.",num[idx+1],num[idx]);
			} else {
				System.out.printf("�Է¹��� �� �� ū ���� %d�̰� ���� ���� %d�Դϴ�.",num[idx],num[idx+1]);
			}
		

		sc.close();
	}
}
