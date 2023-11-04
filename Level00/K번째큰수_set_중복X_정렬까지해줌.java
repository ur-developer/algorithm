package Level00;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수_set_중복X_정렬까지해줌 {
	
	public static void main(String[] args) {
		// 10 3
		// 1 12 33 33 33 6 6 18 9 10 증 3번째 큰 수
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int k = sc.nextInt();
		
		TreeSet<Integer> numbers2 = new TreeSet<Integer>(Collections.reverseOrder());
		
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			numbers2.add(sc.nextInt());
			System.out.println(numbers2);
		}
		System.out.println("-----------------");
		System.out.println(numbers2);
		System.out.println("-----------------");
		int findIndex = numbers2.size() - k;
		// 5 - 1 ==> 4
		// 5 - 2 ==> 3
		System.out.println(findIndex);
		System.out.println(numbers2.first());
		Object[] result = numbers2.toArray();
		System.out.println(result[findIndex]);
	}
}
