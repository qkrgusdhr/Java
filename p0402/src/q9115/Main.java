package q9115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		char str[] = input.toCharArray();
		String result = "";
		for(int i = 0; i < str.length; i++) {
			if(str[i] >= 65 && str[i] <= 90) {
				str[i] = Character.toLowerCase(str[i]);
			}else {
				str[i] = Character.toUpperCase(str[i]);
			}
			result += str[i];
		}
		sc.close();
		System.out.println(result);
	}

}
