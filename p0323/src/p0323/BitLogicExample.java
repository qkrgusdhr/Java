package p0323;

import java.util.Scanner;

public class BitLogicExample {

	public static void main(String[] args) {
		double yard;
		Scanner sc = new Scanner(System.in);
		System.out.printf("yard? ");
		yard = sc.nextDouble();
		
		double cm = yard * 91.44;
		
		System.out.printf("%.1fyard = %.1fcm",yard, cm);
		sc.close();

	}

}
