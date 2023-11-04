package Level00;

import java.util.Scanner;

public class 문자열중문자갯수찾기 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] total = in.next().toUpperCase().toCharArray();
		char find = in.nextLine().toUpperCase().charAt(0);
		int count = 0;
		for(char c: total) {
			if(find == c) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
