package January;

import java.util.Scanner;

public class Solution_1859_�鸸����������Ʈ {

	public static void main(String[] args) {
		
		
		/* �� ������ ������ �ŸŰ��� �ְ�ġ �϶� �Ĵ� ���� �����̱� ������ 
		 *  �ְ�ġ�� �ڿ� ���� �������� ������ ���� ���� �ִٴ� ���̴�
		 	���� �ڿ��� ���� �ְ� �ŸŰ��϶� �ȵ��� �����ؾ��Ѵ�
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
