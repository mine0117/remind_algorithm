package January;

import java.util.Scanner;

public class Solution_5162_µÎ°¡Áö»§ÀÇµô·¹¸¶ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			int cnt = 0;
			int min = Math.min(A, B);
			cnt = C / min;
			System.out.println("#" + test_case + " " + cnt);
		}
	}

}
