package algorithm.Chapter01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int n = s.nextInt();
		
		if(n > 0)
			System.out.println("이 수는 양수입니다.");
		else if (n < 0)
			System.out.println("이 수는 음수입니다.");
		else 
			System.out.println("이 수는 0입니다.");
	}
}
