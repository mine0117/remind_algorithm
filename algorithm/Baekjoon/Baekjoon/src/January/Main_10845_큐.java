package January;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_10845_큐 {
	// 1. 큐 문제
	// 2. 시간초과 남..
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Queue<Integer> que = new LinkedList<Integer>();

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();

			switch (str) {
			case "push":
				int x = sc.nextInt();
				num = x;
				que.add(x);
				break;
			case "pop":
				if (que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(que.poll());
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if (que.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if (que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(que.peek());
				break;
			case "back":
				if (que.isEmpty())
					System.out.println(-1);
				else
					System.out.println(num);
				break;
			}
		}
	}
}