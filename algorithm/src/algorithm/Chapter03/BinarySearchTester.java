package algorithm.Chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = s.nextInt();
		int[] x = new int[num];						// 요소수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");					// 배열의 첫 요소를 먼저 입력받음
		x[0] = s.nextInt();
	
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i]= s.nextInt();
			} while (x[i]< x[i - 1]);				// 바로 앞의 요소보다 작으면 다시 입력받음
		}
		
		System.out.print("검색할 값: ");				// 키 값을 입력받음
		int ky = s.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);		// 배열 x에서 값이 ky인 요소를 검색
		
		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else {
			System.out.println(" 그 값은 x[" + idx + "]에 있습니다.");
		}
	}
}
