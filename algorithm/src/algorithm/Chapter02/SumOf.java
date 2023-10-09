package algorithm.Chapter02;

import java.util.Scanner;

public class SumOf {
	static int sumOf(int[] a) {
		int sum = 0;
		for  (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요소수는 : ");
		int num = s.nextInt();          // 요소수
		
		int[] a = new int[num];         // 요소수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = s.nextInt();
		}
		System.out.println("모든 요소의 합계는 " + sumOf(a) + "입니다." );
	}
}
