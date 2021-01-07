package January;

import java.util.Scanner;

public class Main_2562_譆渤高 {

	public static void main(String[] args) {
		// 天天六
		Scanner sc = new Scanner(System.in);

		int Max = 0;
		int Cnt = 0;

		int[] numbers = new int[9];
		for (int i = 0; i < 9; i++) {

			numbers[i] = sc.nextInt();

			if (numbers[i] > Max) {
				Max = numbers[i];
				Cnt = i + 1;
			}

		}
		System.out.println(Max);
		System.out.println(Cnt);
	}

}