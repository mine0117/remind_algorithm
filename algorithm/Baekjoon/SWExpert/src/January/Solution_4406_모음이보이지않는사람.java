package January;

import java.util.Scanner;

public class Solution_4406_모음이보이지않는사람 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();
			String t = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u')
					continue;
				else {
					t += str.charAt(i);
				}

			}
			System.out.println("#" + test_case + " " + t);
		}

	}

}
