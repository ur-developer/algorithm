package algorithm;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if(b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값은: ");
		int a = s.nextInt();
		System.out.print("a의 값은: ");
		int b = s.nextInt();
		System.out.print("c의 값은: ");
		int c = s.nextInt();

		System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
	}
}
