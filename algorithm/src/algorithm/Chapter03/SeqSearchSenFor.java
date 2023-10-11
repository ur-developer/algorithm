package algorithm.Chapter03;

import java.util.Scanner;

class SeqSearchSenFor {
	
	//--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 선형검색(보초법)---//
	static int seqSearchSen(int[] a, int n, int key) {
		int i;

		a[n] = key;					// 보초를 추가

		for (i = 0; a[i] != key; i++);
			
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = s.nextInt();
		int[] x =  new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = s.nextInt();	
		}

		System.out.print("검색 값 : ");					// 키 값을 입력받음
		int ky = s.nextInt();
		
		int idx = seqSearchSen(x, num, ky);				// 배열 x에서 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");	
	}
}
