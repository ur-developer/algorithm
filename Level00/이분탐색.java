package Level00;

import java.util.Arrays;

public class 이분탐색 {
	public static void main(String[] args) {
		int[] num = { 1, 4, 5, 2, 7, 8, 9, 6 };
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.binarySearch(num, 5));
		System.out.println(Arrays.binarySearch(num, 10));
		// -이면 존재하지 않는다는 의미
		System.out.println(Arrays.binarySearch(num, 1, 5, 2));
		System.out.println(Arrays.binarySearch(num, 1, 5, 8));
	}
}
