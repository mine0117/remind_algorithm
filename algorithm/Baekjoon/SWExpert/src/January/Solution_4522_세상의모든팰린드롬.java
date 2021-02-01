package January;

import java.util.Scanner;

public class Solution_4522_세상의모든팰린드롬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String s = sc.next();
			int N = s.length();
			int flag = 0;
			for(int i = 0; i < N/2; i++) {
				if((s.charAt(i) == '?') || (s.charAt(N-1-i) == '?'))
					continue;
				if(s.charAt(i) != s.charAt(N-i-1)) {
					flag = 1;
					break;
				}
			}
			System.out.print("#" + test_case + " ");
			if(flag == 1)
				System.out.println("Not exist");
			else
				System.out.println("Exist");
		}
	}
}