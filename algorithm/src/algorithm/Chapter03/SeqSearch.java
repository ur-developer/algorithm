package algorithm.Chapter03;

import java.util.Scanner;

class SeqSearch {
	// 요소수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n)
				return -1;		// 검색 실패(-1을 반환)
			if (a[i]== key)
				return i;		// 검색 성공(인덱스를 반환)
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = s.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = s.nextInt(); 
		}
	
		System.out.println("검색할 값: ");
		int ky = s.nextInt();
		int idx = seqSearch(x,  num,  ky);		// 배열 x에서 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}
}
