package homework9_first_ide_app;

import java.util.Random;

public class Main1 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			int cout = rand.nextInt(mas[i].length);
			mas[i][cout] = 1;

		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}

			System.out.println();
		}

		int[] ar = mas[0];
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("{%4d}", ar[i]);
		}
	}
}
