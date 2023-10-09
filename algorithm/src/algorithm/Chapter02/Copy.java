package algorithm.Chapter02;

import java.util.Scanner;

public class Copy {
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i]= b[i]; 
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("a의 요소수는 : ");
		int numa = s.nextInt();            			// 요소수
		int[] a = new int[numa];		 			// 요소수가 numa인 배열
		for(int i = 0 ; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = s.nextInt();
		}

		System.out.print("b의 요소수는 : ");
		int numb = s.nextInt();						// 요소수
		int[] b = new int[numb];					// 요소수가 numb인 배열
		for(int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i]= s.nextInt(); 
		}
		
		copy(a, b);									// 배열 b의 모든 요소를 배열 a에 copy
		
		System.out.println("배열 b의 모든 요소를 배열 a에 copy하였습니다");
		for (int i = 0; i <numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
