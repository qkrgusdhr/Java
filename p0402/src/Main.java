import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		char str[] = input.toCharArray();
		for(int i = 0; i < str.length; i++) {
			if(Character.isAlphabetic(str[i]) == true) {
				result += Character.toUpperCase(str[i]);
			}
		}
		System.out.print(result);
		
		
	}

}
