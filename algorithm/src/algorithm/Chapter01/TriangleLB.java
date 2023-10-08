package algorithm.Chapter01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		
		do { // 직각이등변삼각형의 단 수
			System.out.println("몇 단 삼각형입니까?: ");
			n = s.nextInt();
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) {     // 행 루프
			for ( int j = 1; j <= i; j++)  // 열 루프
				System.out.print('*');
			System.out.println();
		}
	}
}
