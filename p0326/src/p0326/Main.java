package p0326;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
