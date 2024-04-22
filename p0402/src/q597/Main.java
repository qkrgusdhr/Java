package q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input;
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			input = sc.next().charAt(0);
			if(Character.isAlphabetic(input)) {
				System.out.println(Character.isUpperCase());
			}else if(Character.isDigit(input)) {
				System.out.println((int)input);
			}else {
				break;
			}
		}
		
//		while (true) {
//			input = sc.next().charAt(0);
//			if ((input >= 65 && input <= 90) || (input >= 97 && input <= 120)) {
//				System.out.println(input);
//			} else if (input >= 48 && input <= 57) {
//				System.out.println((int) input);
//			} else {
//				break;
//			}
//		}
		sc.close();

	}

}
