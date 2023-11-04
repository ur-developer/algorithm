package Level00;

import java.util.Scanner;

public class StringRepeat {

 class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    	}
 	}
}

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += str;
        }
        System.out.println(answer);
    }
}