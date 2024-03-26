package p0326;

import java.util.Scanner;

public class q531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float weight;
		Scanner sc = new Scanner(System.in);
		weight = sc.nextFloat();
		sc.close();
		if(weight <= 50.80) {
			System.out.println("Flyweight");
		}else if(weight <= 61.23) {
			System.out.println("Lightweight");
		}else if(weight <= 72.57) {
			System.out.println("Middleweight");
		}else if(weight <= 88.45) {
			System.out.println("Cruiserweight");
		}else {
			System.out.println("Heavyweight");
		}
		
	}

}
