package algorithm.Chapter03;

import java.util.Scanner;

class SeqSearchSen {
	// 요소수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;				// 보초를 추가
		
		while (true) {
			if (a[i] == key)		// 검색 성공
				break;
			i++;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = s.nextInt();
		int[] x = new int[num + 1];				// 요소수가 num + 1인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = s.nextInt(); 
		}
	
		System.out.print("검색할 값: ");		// 키값을 입력받음
		int ky = s.nextInt();
		
		int idx = seqSearchSen(x, num, ky);		// 배열 x에서 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}
}