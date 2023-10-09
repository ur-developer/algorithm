package algorithm.Chapter02;

// 배열 요소의 최댓값을 출력(값을 난수로 생성)

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i]> max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수: ");
		int num = s.nextInt();					// 배열의 요솟수를 입력받음
			
		int[] height = new int[num]; 			// 요솟수가 num인 배열을 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90); // 요솟값을 난수로 결정
			System.out.println("height[" + i +"]: " + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height)+ "입니다." );
	}
}