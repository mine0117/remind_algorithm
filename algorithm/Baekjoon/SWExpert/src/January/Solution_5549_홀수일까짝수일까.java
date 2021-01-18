package January;

import java.util.Scanner;

public class Solution_5549_È¦¼öÀÏ±îÂ¦¼öÀÏ±î {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();
			int a = str.charAt(str.length() - 1) - '0';

			if (a % 2 == 0) {
				System.out.println("#" + test_case + " " + "Even");
			} else {
				System.out.println("#" + test_case + " " + "Odd");
			}

		}
	}

}
