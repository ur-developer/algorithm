package Level00;

public class 두수의연산값비교하기 {
	class Solution {
	    public int solution(int a, int b) {
	        int answer = 0;

	        int t1 = Integer.parseInt("" + a + b);
	        int t2 = 2 * a * b;

	        if(t1 >= t2) {
	            answer = t1;
	        } else {
	            answer = t2;
	        }
	        return answer;
	    }
	}
}