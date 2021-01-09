package January;

import java.util.Arrays;

import java.util.Scanner;

public class Main_2110_�����⼳ġ {
	
	/* �� ������ �� ������ ������ �Ÿ��� �ִ�� �ϴ� �Ÿ��� ����ϴ� �̺�Ž���� Ȱ���� �����̴�
	 * ������ ���� 1,2,8,4,9���� �ִ� �Ÿ��� 3�̶�� ��������, 5�� �����ϴ� �� ó���� ���� �����ϱⰡ ������� 
	 * 
	 * 1. ���� �ٽ� ������ ���� 1�� ��ġ, 4�� ��ġ �ϰ� �������� 8,9 �߿� ��ġ�ϸ� �ִ�Ÿ��� 3�� �ȴ�. 
	 * 2. �Ÿ� ������ 1�� �ְ�, ���� �� �Ÿ��� �������� - ó�� �� �̴�.
	 * 3. ��ǥ���� �����ϰ� , �߰����� �������� c�̻� ��ġ���� ���� �Ǵ�
	 */
	public static void main(String[] args) {
								
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int start = 1;
		int end = arr[N - 1] - arr[0];
		int res = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			int left = arr[0];
			int cnt = 1;

			for (int i = 1; i < N; i++) {
				if (arr[i] - left >= mid) {
					cnt++;
					left = arr[i];
				}
			}
			if (cnt >= C) {
				res = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(res);
	}
}