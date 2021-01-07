package January;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2217_로프 {

	// 병렬로 연결할때 각 로프가 버틸수 있는 최대 중량을 구하기
	// 1. 로프중 가장 적은 중량을 드는 로프가 버틸수있는 중량 기준
	// 2. 만약 로프 3개로 2, 6, 10 로프가 있을 때, 2을 기준으로 2*3 = 6이다. 차라리 10 하나만 사용하는게 더 낫다.
	// 3. 6로 하면 6*2 = 12로 10 하나만 들때보다 더 최대 중량이 된다.
	// 4. 이를 구현하기 위해 정렬하고 마지막 값을 max 값으로 설정, 그리고 for 문으로 해당로프 중량 * 해당로프부터 마지막 로프 갯수를 max와 비교
	
	// 코드는 짧은데... 생각하는데 시간 걸림..
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
