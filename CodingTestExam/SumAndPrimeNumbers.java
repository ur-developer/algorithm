package algorithm;

public class SumAndPrimeNumbers {
    public static void main(String[] args) {
        // 1. 1부터 100까지의 합 구하기
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합: " + sum);

        // 2. 1부터 100까지의 소수 찾기
        System.out.println("1부터 100까지의 소수:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // 소수인지 확인하는 함수
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
