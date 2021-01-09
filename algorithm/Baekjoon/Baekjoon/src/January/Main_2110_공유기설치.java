package January;

import java.util.Arrays;

import java.util.Scanner;

public class Main_2110_공유기설치 {
	
	/* 이 문제는 두 공유가 사이의 거리를 최대로 하는 거리를 출력하는 이분탐색을 활용한 문제이다
	 * 예제로 나온 1,2,8,4,9에서 최대 거리가 3이라고 나왓을때, 5로 생각하는 등 처음에 문제 이해하기가 힘들었다 
	 * 
	 * 1. 내가 다시 이해한 것은 1에 설치, 4에 설치 하고 나머지를 8,9 중에 설치하면 최대거리가 3이 된다. 
	 * 2. 거리 시작을 1로 주고, 가장 긴 거리는 마지막값 - 처음 값 이다.
	 * 3. 좌표값을 정렬하고 , 중간값을 기준으로 c이상 설치할지 말지 판단
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