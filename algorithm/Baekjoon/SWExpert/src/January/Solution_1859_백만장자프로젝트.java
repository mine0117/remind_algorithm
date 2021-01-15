package January;

import java.util.Scanner;

public class Solution_1859_백만장자프로젝트 {

	public static void main(String[] args) {
		
		
		/* 이 문제의 관건은 매매가가 최고치 일때 파는 것이 이익이기 때문에 
		 *  최고치가 뒤에 있을 있을수록 이익이 많이 볼수 있다는 것이다
		 	따라서 뒤에서 부터 최고 매매가일때 팔도록 구현해야한다
		*/
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[N-1];
			long ans = 0;
			for (int i = N-2; i >=0 ; i--) {
				if (max > arr[i]) {
					ans += max - arr[i];
				} else {
					max = arr[i];
				}
			}
			System.out.println("#" + test_case + " " + ans);

		}

	}

}
