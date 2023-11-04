package Level00;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램_hashSet_슬라이딩윈도우 {
	public static void main(String[] args) {
		// abccbasabc
		// abc
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		String ana =  sc.next();
		
		char[] data2 = data.toCharArray();
		char[] ana2 = ana.toCharArray();
		
		// 찾을 값을 hashmap에 넣기
		//  3
		// {a=1, b=1, c=1}
		System.out.println(ana2.length);
		
		for (int i = 0; i < ana2.length; i++) {
			map1.put(ana2[i], map1.getOrDefault(ana2[i], 0) +1);
		}
		
		int count = 0;
		System.out.println(data2.length);
		for (int i = 0; i < data2.length -  ana2.length +1; i++) {
			int start = i;
			int end = i + ana2.length -1 ;
			System.out.println(start + " : " + end);
			char[] window = Arrays.copyOfRange(data2, start, end+1);
			System.out.println(Arrays.toString(window));
			for(int j = 0; i<window.length; j++) {
				map2.put(window[j], map2.getOrDefault(window[j],  0)+1);
			}
			System.out.println(map2);
			
			// map1, map2의 비교해서 애너그램인지 판정
			if(map1.equals(map2)) {
				count++;
				System.out.println(count + "===>" + map2);
			}
			map2.clear();
		}
	}
}
