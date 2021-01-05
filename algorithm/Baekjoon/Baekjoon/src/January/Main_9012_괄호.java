package January;

import java.util.Scanner;

public class Main_9012_괄호 {

	
	// '('가 나오면 스택에 PUSH 하고 ')'가 나오면 POP 
	// 유효하지 않는 것을 판단하는 기준
	// 1. pop 연산을하려고하는데 닫는 괄호가 입력된다면 유효하지않음 
	// 2. 모든 연산이 다 끝났는데 스택에 괄호가 남아 있다면 유효하지않음
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