package January;

import java.util.Scanner;

public class Solution_10200_구독자전쟁 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int max, min = 0;
			int tmp = A + B;
			if (tmp > N)
				min = tmp - N;
			else
				min = 0;
				max = A > B ? B : A;
			System.out.println("#" + test_case + " " + max + " " + min);
		}
	}

}
