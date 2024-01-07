package algorithm;

public class SumEvenNumbers {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 2; i<=100; i+=2) {
			sum += i;
		}
		
		System.out.println("1부터 100까지 짝수의합: " + sum);
	}

}
