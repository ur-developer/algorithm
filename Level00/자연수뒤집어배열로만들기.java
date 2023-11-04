package Level00;

import java.util.Stack;

public class 자연수뒤집어배열로만들기 {
	
class Solution {	
	public int[] solution(long n) { 
		//long n =12345;
		String s = n + ""; // String.valueOf(n), "12345"
		String[] s2 = s.split(""); // {"1","2","3","4","5"}
		int[] answer = new int[s.length()]; // [5,4,3,2,1]
		Stack<String> stack = new Stack<>();
		for(String x: s2) {
			stack.push(x); // bottom : {"1","2","3","4","5"} : top
		}
		for(int i = 0; i<s2.length; i++) {
			answer[i]= Integer.parseInt(stack.pop());
			// "5"->"4"->"3"->"2"->"1" pop
		}
		return answer;	
		}
	}
}