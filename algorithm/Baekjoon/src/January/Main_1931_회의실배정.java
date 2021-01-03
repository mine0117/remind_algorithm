package January;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1931_회의실배정 {
    
	
	// 1. 일단 이 문제는 이전 선택의 종료시간과 이후 선택의 시작시간이 겹치면 안됨
	// 2. 최대한 많은활동을 선택할려면 종료시간이 짧아야함
	// 3. 내가 푼 방법 : 종료시간을 기준으로 정렬하고, 이전 종료시간에 대해 겹치는것을 제외하고 나머지 부분에서 선택하여 풀어봄
	// 4. 후기 : Comparator 사용을 거의 안해봐서 고생했음, 다른 방법도 있을것같은데 한번 찾아봐야겠다
	
	static int N;
	static int[][] arr;

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {

				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}

				return o1[1] - o2[1];
			}

		});

		int cnt = 0;
		int pre = 0;

		for (int i = 0; i < N; i++) {

			if (pre <= arr[i][0]) {
				pre = arr[i][1];
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}