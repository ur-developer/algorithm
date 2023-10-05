문제 설명

정수 리스트 num_list가 주어질 때,
첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
음수가 없다면 -1을 return합니다.

class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0 )
                return i;
                }
           return -1;
        }
}

문제 설명
알파벳으로 이루어진 문자열 myString이 주어집니다.
모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
	
class Solution {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}

문제 설명
'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다.
문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
        }
}

문제 설명
두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a+b);
    }
}

문제 설명
실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.

class Solution {
      public int solution(double flo)  
	return (int) flo;
    }
}

문제 설명
영어 알파벳으로 이루어진 문자열 str이 주어집니다.
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();

        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        } 
        System.out.println(answer);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.print((char)(c+32));
            }
            else {
                System.out.print((char)(c-32));
            }
        }
    }
}


문제 설명
다음과 같이 출력하도록 코드를 작성해 주세요.

출력 예시

!@#$%^&*(\'"<>?:;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print(
            "!"+"@"+"#"+"$"+"%"+"^"+"&"+"*"+"("+"\\"+"\'"+"\""+"<"+">"+"?"+":"+";");
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}

문제 설명
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 
문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

class Solution {
	public long solution(String numbers) {
  	     String[] numbers_arr={ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};       
	        for(int i = 0; i< numbers_arr.length; i++) {
	            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
	        }
	        
	        long answer=Long.parseLong(numbers);
	        return answer;
	        }
          }
}


문제 설명
문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, 
A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록
solution 함수를 완성해보세요.

class Solution {
    public int solution(String A, String B) {
        return(B+B).indexOf(A);
    }
}
문제 설명

군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
암호화된 문자열 cipher를 주고받습니다.
그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] x = cipher.split(""); // 문자하나하나 split으로 배열
        StringBuilder y = new StringBuilder();
        for (int i = code-1; i < x.length; i += code){
            y.append(x[i]);
        }
        answer = y.toString();
        return answer;
    }
}

public class 암호해독 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code =4;
		
		char[] cipher2 = cipher.toCharArray();
		char[] result = new char[cipher2.length/code];
		
		for (int i = 0; i < result.length; i++) {
			int code2 = code*(i+1);
			result[i] = cipher2[code2-1];
		}
		System.out.println(String.valueOf(result));
	}
}

문제 설명
문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 
오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
class Solution {
    public int[] solution(String my_string) {
     
        my_string = my_string.replaceAll("[a-z]","");
        
        int[] answer = new int[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.charAt(i) -'0';
            }
        
        Arrays.sort(answer);
            
        return answer;
    }
}

문제 설명
문자열 str1, str2가 매개변수로 주어집니다.
 str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(String str1, String str2) {
        return (str1.contains(str2)? 1: 2);
    }
}

문제 설명
문자열 my_string이 매개변수로 주어질 때, 
대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c>='a'&&c<='z')c-=32;
            else if(c>='A'&&c<='Z')c+=32;
            answer+=c;
        }
        return answer;    
    }
}

문제 설명
문자열 my_str과 n이 매개변수로 주어질 때,
my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n -1)/n;
        String[] answer = new String[resultCnt];
        
        for(int i= 0; i < resultCnt; i++){
        int start = n*i;
        int end = start + n >= my_str.length()? my_str.length(): start + n;
        answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}


문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴
배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
*****참가자 중에는 동명이인이 있을 수 있습니다. (중요)

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String player : participant) map.put(player, map.getOrDefault(player,0)+1);
        for(String player : completion) map.put(player, map.get(player)-1);
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() !=0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}

문제 설명
두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.

a + b = c

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d",a,b,a+b);
    }
}

문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, 
num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        answer = Arrays.copyOfRange(num_list,0,n);

        return answer;
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i=0; i<n;i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}

문제 설명
정수 number와 n, m이 주어집니다. 
number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int number, int n, int m) {
        if(number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

문제 설명
정수가 담긴 리스트 num_list가 주어질 때, 
모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록
solution 함수를 완성해주세요.

class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;

        for(int num: num_list) {
            sum+=num;
            multiply*=num;
        }
        return multiply<(sum*sum)?1:0;
    }
}