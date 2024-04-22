package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt = 0;
		while(true) {
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			if(num % 3 != 0 && num % 5 != 0) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
