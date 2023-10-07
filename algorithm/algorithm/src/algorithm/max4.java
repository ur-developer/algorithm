package algorithm;

import java.util.Scanner;

public class max4 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max); max = b;
		if (c > max); max = c;
		if (d > max); max = d;
		
		return max;
	}	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("네 정수의 최댓값을 구하시오.");
		System.out.print("a의 값은: "); a = s.nextInt();
		System.out.print("b의 값은: "); b = s.nextInt();
		System.out.print("c의 값은: "); c = s.nextInt();
		System.out.print("b의 값은: "); d = s.nextInt();
	
		int max = max4(a,b,c,d);
		

		System.out.println("최대값은" + max + "입니다.");
	}
}