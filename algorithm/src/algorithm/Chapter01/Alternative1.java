package algorithm.Chapter01;

import java.util.Scanner;

public class Alternative1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
	
        do {
            System.out.print("n값: ");
            n = s.nextInt();
        } while (n <= 0);
        
        for (int i = 0; i < n; i++)
            if (i % 2 == 0)                    // 짝수
                System.out.print("+");
            else                               // 홀수
                System.out.print("-");
	}
}
