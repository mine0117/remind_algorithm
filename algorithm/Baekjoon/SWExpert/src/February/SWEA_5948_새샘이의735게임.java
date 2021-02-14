package February;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SWEA_5948_새샘이의735게임 {

	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			List<Integer> list = new ArrayList<>();
			HashSet<Integer> set = new HashSet<>();
			arr = new int[7];

			for (int i = 0; i < 7; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < 7; i++) {
				for (int j = i + 1; j < 7; j++) {
					for (int k = j + 1; k < 7; k++) {
						set.add(arr[i] + arr[j] + arr[k]);
					}
				}
			}
			
			
			list.addAll(set);
			Collections.sort(list, Collections.reverseOrder());
			
			System.out.println("#" + test_case + " " + list.get(4));
		}
	}

}
