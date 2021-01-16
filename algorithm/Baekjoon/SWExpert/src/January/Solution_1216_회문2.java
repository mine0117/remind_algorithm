package January;

import java.util.Scanner;

public class Solution_1216_È¸¹®2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		for (int test = 1; test <= 10; test++) {
			int T = sc.nextInt();

			int[][] map = new int[100][100];
			for (int i = 0; i < 100; i++) {
				String s = sc.next();
				for (int j = 0; j < 100; j++) {
					map[i][j] = s.charAt(j) - 'A';
				}
			}

			int ans = 1;
			for (int n = 2; n <= 100; n++) {
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - n; j++) {
						boolean flag = true;
						for (int p = 0; p < n / 2; p++) {
							if (map[i][j + p] != map[i][j + n - p - 1]) {
								flag = false;
								break;
							}
						}
						if (flag && ans < n)
							ans = n;
					}
				}

				for (int j = 0; j < 100; j++) {
					for (int i = 0; i <= 100 - n; i++) {
						boolean ch = true;
						for (int p = 0; p < n / 2; p++) {
							if (map[i + p][j] != map[i + n - p - 1][j]) {
								ch = false;
								break;
							}
						}
						if (ch && ans < n)
							ans = n;
					}
				}
			}
			System.out.println("#" + T + " " + ans);
		}

	}
}
