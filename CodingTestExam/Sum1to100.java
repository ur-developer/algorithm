package algorithm;

public class Sum1to100 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1부터 100까지의 합: " + sum);
	}
}
