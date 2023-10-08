package algorithm.Chapter01;

import java.util.Scanner;

class min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("네 정수의 최소값을 구하시오.");
		System.out.print("a의 값은: "); a = s.nextInt();
		System.out.print("b의 값은: "); b = s.nextInt();
		System.out.print("c의 값은: "); c = s.nextInt();
		System.out.print("d의 값은: "); d = s.nextInt();

		int min = min4(a, b, c, d);
		System.out.println("최소값은 " + min + "입니다.");
	}
}
