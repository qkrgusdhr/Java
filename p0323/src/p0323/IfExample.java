package p0323;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력 : ");
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}else {
			System.out.print("B");
			if(score >= 85) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
		sc.close();
	}

}
