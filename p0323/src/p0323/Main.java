package p0323;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		sc.close();
		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d years later", 20 - age);
		}
	}
}
