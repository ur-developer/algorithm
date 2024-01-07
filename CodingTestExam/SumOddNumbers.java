package algorithm;

public class SumOddNumbers {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=100; i+=2) {
			sum += i;
		}
		
		System.out.println("1부터 100까지의 홀수의 합: " + sum);
	}
}
