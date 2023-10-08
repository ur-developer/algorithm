package algorithm.Chapter01;

import java.util.Scanner;

public class SumVerbose1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n값: ");
			n = s.nextInt();
		} while (n <= 0);
		
		int sum = 0;       // 합
		
		for (int i = 1; i <= n; i++) {
			if (i < n) 				// 중간 과정
				System.out.println(i + " + ");
			else 					// 마지막 과정
				System.out.println(i + " = ");
			sum += i;				// sum에 i를 더함
		}
		System.out.println(sum);
	}
}
