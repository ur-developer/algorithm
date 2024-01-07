package algorithm;

public class AverageOfArray {
	public static double calculateAverage(int[] array) {
		
		int sum = 0;
		
		for(int num : array) {
			sum += num;
		}
		return (double) sum / array.length;

	}
	
	public static void main(String[] args) {
		int[] numbers= {3,5,7,9,2};
		double average = calculateAverage(numbers);
		System.out.println("Average of the numbers is: " + average);
	}
}
