package algorithm.Chapter02;

import java.util.Random;

public class MaxOfArrayRand2 {
	//배열 a의 최댓값을 구하여 반환
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) 
			if (a[i]> max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = 1 + rand.nextInt(20);
		
		int[] height = new int[num]; //요솟수가 num인 배열을 생성
		
		System.out.println("사람수는 " + num + "명 입니다.");
		
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]:" + height[i]);
		}

		System.out.println("최댓값은" + maxOf(height)+ "입니다." );		
	}
}