package algorithm;

import java.util.Scanner;

class min3 {	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;

		return min;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("최소값을 구하시오.");
		System.out.print("a의 값은: "); a = s.nextInt();
		System.out.print("b의 값은: "); b = s.nextInt();
		System.out.print("c의 값은: "); c = s.nextInt();
		
		int min = min3(a, b, c); 
		
		System.out.println("최소값은 " + min + "입니다.");
	}
}
