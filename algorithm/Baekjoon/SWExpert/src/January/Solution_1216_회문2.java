package January;

import java.util.Scanner;

public class Solution_1216_È¸¹®2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			int res = 1;
			int[][] arr = new int[100][100];

			for (int i = 0; i < 100; i++) {
				String str = sc.next();
				for (int j = 0; j < 100; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			for (int i = 100; i > 1; i--) {
				if (res > 1) {
					break;
				}

				for (int j = 0; j < 100; j++) {
					for (int k = 0; k < 100 - i + 1; k++) {
						int tmp = 0;
						for (int l = 0; l < i / 2; l++) {
							if (arr[j][k + l] != arr[j][k + i - k - 1]) {
								tmp = -1;
							}

						}
						if (tmp == 0)
							res = i;
					}
				}

				for (int j = 0; j < 100 - i + 1; j++) {
					for (int k = 0; k < 100; k++) {
						int tmp = 0;
						for (int l = 0; l < i / 2; l++) {
							if (arr[j + k][l] != arr[j + i - k - 1][l]) {
								tmp = -1;
							}
						}
						if (tmp == 0) {
							res = i;
						}
					}
				}
				System.out.println("#" + test_case + " " + res);
			}
		}
	}
}
