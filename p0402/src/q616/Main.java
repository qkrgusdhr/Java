package q616;

import java.util.Scanner;

class Centroid {
	double num;

	public Centroid(double num) {
		this.num = num;

	}
}

public class Main {

	public static void main(String[] args) {
		Centroid[][] tri = new Centroid[3][2];
		Scanner sc = new Scanner(System.in);
		double sumX = 0;
		double sumY = 0;
		for (int i = 0; i < tri.length; i++) {
			for (int j = 0; j < tri[i].length; j++) {
				double num = sc.nextDouble();
				tri[i][j] = new Centroid(num);
				if (j == 0) {
					sumX += tri[i][j].num;
				} else {
					sumY += tri[i][j].num;
				}
			}
		}

		sc.close();

		double avgX = sumX / (tri.length);
		double avgY = sumY / (tri.length);

		System.out.printf("(%.1f, %.1f)\n", avgX, avgY);
	}
}
