package January;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_1221_GNS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] num = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

		for (int test_case = 1; test_case <= T; test_case++) {
			ArrayList<Integer> a = new ArrayList();
			String k = sc.next();
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				String tmp = sc.next();
				for (int j = 0; j < 10; j++) {
					if (num[j].equals(tmp)) {
						a.add(j);
					}
				}
			}

			Collections.sort(a);
			System.out.println("#" + test_case);
			for (int i = 0; i < n; i++) {
				int tmp = a.get(i);
			
				System.out.print(num[tmp] + " ");
			}
			System.out.println();
		}
	}
}