package January;

import java.util.Scanner;

public class Main_10988_팰린드롬인지확인하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		int ans = 1;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				 ans = 0;
			}
		}
		System.out.println(ans);
	}

}
