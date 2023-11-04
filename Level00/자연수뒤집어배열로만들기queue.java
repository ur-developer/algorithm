package Level00;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 자연수뒤집어배열로만들기queue {

class Solution {
	public int[] solution(long n) {
		String[] s = String.valueOf(n).split("");
		int[] answer = new int[s.length];
		Queue<String> queue = new LinkedList<>();
		for(String c: s) {
			queue.add(c);
		}
		
		for(int i = s.length -1; i >= 0; i--) {
			answer[i] = Integer.parseInt(queue.remove());
		}
		System.out.println(Arrays.toString(answer));
		return answer;
		}
	}
}