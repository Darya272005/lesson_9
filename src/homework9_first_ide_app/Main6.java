package homework9_first_ide_app;

import java.util.Random;

public class Main6 {

	public static void main(String[] args) {
		int[][] mas = new int[4][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 0; j < mas[0].length; j++) {
			if (mas[0][j] > mas[mas.length - 1][j]) {
				for (int k = 0; k < mas.length; k++) {
					System.out.printf("[%4d]\n", mas[k][j]);
				}
				System.out.println();
			}
		}
	}
}