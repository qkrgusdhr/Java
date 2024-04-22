package p0326;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num[] = new int[9];
		int sum = 0;
		int per1 = 0;
		int per2 = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[i] + num[j] == sum - 100) {
					per1 = i;
					per2 = j;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (per1 == i || per2 == i) {
				continue;

			}
			System.out.println(num[i]);
		}
		sc.close();

	}

}
