package algorithm.Chapter01;

import java.util.Scanner;

public class SumOf {
	static int sumof(int a, int b) {
		int min; // a,b의 작은 쪽의 값 
		int max; // a,b의 큰 쪽의 값

		if (a < b) {
			min = a; max = b;
		} else {
			min = b; max = a;
		}

		int sum = 0;  // 총합
		for (int i = min; i <= max; i++)
				sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("a와 b를 포함하여 그 사이에 있는 모든 정수의 총합을 구합니다.");
		System.out.print("a의 값 : "); int a = s.nextInt();
		System.out.print("b의 값 : "); int b = s.nextInt();

		System.out.println("정수 a, b 사이의 모든 정수의 총합은 " + sumof(a, b) + "입니다.");
	}
}
