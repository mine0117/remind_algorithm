package January;

import java.util.Scanner;

public class Solution_10505_¼ÒµæºÒ±ÕÇü {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			int avg = sum / N;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] <= avg) {
					cnt++;
				}
			}
			System.out.println("#"+test_case+" "+cnt);
		}
	}

}
