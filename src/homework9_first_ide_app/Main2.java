package homework9_first_ide_app;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {

		int[][] mas = new int[2][3];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}

		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%d ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
