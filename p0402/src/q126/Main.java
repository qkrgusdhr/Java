package q126;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		int odd = 0;
		int even = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			num.add(sc.nextInt());
			if (num.get(i) % 2 == 1) 
				odd++;
			if (num.contains(0) == true)
				break;
			if (num.get(i) % 2 == 0)
				even++;
			i++;
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		sc.close();
	}
}
