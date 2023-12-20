package Level00;

public class 원소들의곱과합 {
	class Solution {
	    public int solution(int[] num_list) {
	        int sum = 0;
	        int multiply = 1;

	        for(int num: num_list) {
	            sum+=num;
	            multiply*=num;
	        }
	        return multiply<(sum*sum)?1:0;
	    }
	}
}
