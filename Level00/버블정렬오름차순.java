package Level00;

import java.util.Arrays;
import algorithm.Util;

public class 버블정렬오름차순 {
	public static void main(String[] args) {
		int[] array = { 6, 4, 2, 1, 3, 5 };

		for (int i= 0; i < array.length-1; i++) {
			int min = array[i];
			int ix = i;
			
			// 최소값 찾기
			for(int j = i+1; j<array.length; j++) {
				if(array[j] < min) {
					ix = j;
					min = array[j];
				}
			}
			Util.swap(array, i, ix);
		}
		System.out.println(Arrays.toString(array));
	}
}
