package homework9_first_ide_app;

import java.util.Random;

public class Main5 {

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
		for (int i = 0; i < mas.length; i = i + 2) {
			System.out.printf("{%3d}-", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

}
