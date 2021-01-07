package January;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2217_���� {

	// ���ķ� �����Ҷ� �� ������ ��ƿ�� �ִ� �ִ� �߷��� ���ϱ�
	// 1. ������ ���� ���� �߷��� ��� ������ ��ƿ���ִ� �߷� ����
	// 2. ���� ���� 3���� 2, 6, 10 ������ ���� ��, 2�� �������� 2*3 = 6�̴�. ���� 10 �ϳ��� ����ϴ°� �� ����.
	// 3. 6�� �ϸ� 6*2 = 12�� 10 �ϳ��� �鶧���� �� �ִ� �߷��� �ȴ�.
	// 4. �̸� �����ϱ� ���� �����ϰ� ������ ���� max ������ ����, �׸��� for ������ �ش���� �߷� * �ش�������� ������ ���� ������ max�� ��
	
	// �ڵ�� ª����... �����ϴµ� �ð� �ɸ�..
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[N];

		for (int i = 1; i <= N; i++) {
			max = Math.max(max, arr[i] * (N - (i - 1)));
		}
		System.out.println(max);
	}

}
