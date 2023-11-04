package Level00;

public class 첫번째로나오는음수 {
	class Solution {
	    public int solution(int[] num_list) {
	        for (int i = 0;i < num_list.length;i++)
	            if (num_list[i] < 0)
	                return i;
	        return -1;
	    }
	}

	public int solution(int[] num_list) {
    for (int i = 0; i < num_list.length; i++) {
        if (num_list[i] < 0 )
            return i;
    		}
    	return -1;
	}
}