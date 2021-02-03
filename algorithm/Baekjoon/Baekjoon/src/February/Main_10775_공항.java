package February;

import java.util.Scanner;

public class Main_10775_°øÇ× {

	static int[] parent;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parent = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			parent[i] = i;
		}
		int answer = 0;

		while (M-- > 0) {
			int gate = sc.nextInt();
			if (find(gate) == 0)
				break;
			answer++;
			union(find(gate), find(gate) - 1);
		}
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		parent[a] = b;

	}

	private static int find(int x) {
		if (x == parent[x])
			return x;
		return parent[x] = find(parent[x]);
	}
}
