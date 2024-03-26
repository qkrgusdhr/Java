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
				System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.",num[idx+1],num[idx]);
			} else {
				System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.",num[idx],num[idx+1]);
			}
		

		sc.close();
	}
}
