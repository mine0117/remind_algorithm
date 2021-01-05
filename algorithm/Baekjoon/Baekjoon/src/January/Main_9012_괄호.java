package January;

import java.util.Scanner;

public class Main_9012_��ȣ {

	
	// '('�� ������ ���ÿ� PUSH �ϰ� ')'�� ������ POP 
	// ��ȿ���� �ʴ� ���� �Ǵ��ϴ� ����
	// 1. pop �������Ϸ����ϴµ� �ݴ� ��ȣ�� �Էµȴٸ� ��ȿ�������� 
	// 2. ��� ������ �� �����µ� ���ÿ� ��ȣ�� ���� �ִٸ� ��ȿ��������
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			String str = sc.next();
			String[] arr = str.split("");
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("(")) {
					cnt++;
				} else if (arr[j].equals(")")) {
					cnt--;
				}
				if (cnt < 0) {
					System.out.println("NO");
					break;
				}
			}
			if (cnt >= 0)
				System.out.println(cnt > 0 ? "NO" : "YES");
		}
	}
}