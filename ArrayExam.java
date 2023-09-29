
//ArrayChenk
public class ArrayCheck {
	public static void main(String[] args) {
		// 1) 배열을 만드는 방법1
		//	  배열을 만들 때 부터 값을 알고 있는 경우
		int [] ages = {60, 60 ,30, 20, 10}; 
		
		// 2) 배열을 만드는 방법2
		//    배열를 만들 때는 값을 모르고 나중에 값을 넣는 경우
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 88.5;
		weight[3] = 99.5;
		weight[4] = 35.5;
		
		// for문 2가지
		// c 타입
		for( int i = 0; i < weight.length; i++) {
			System.out.println(ages[i]+ " " + weight[i] );
		}
	
		// for-each
		for ( double d : weight) {
			System.out.println(d);
		}
	}
}

<Console>
60 77.8
60 45.5
30 88.5
20 99.5
10 35.5
77.8
45.5
88.5
99.5
35.5

//ArrayEx01
public class ArrayEx01 {
	public static void main(String[] args) {
		for ( int i = 0; i < 10; i++) {
			for ( int j = 0; j < 10; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

<Console>
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9 
0 1 2 3 4 5 6 7 8 9

//ArrayEx02
public class ArrayEx02 {

	public static void main(String[] args) {
		for (int i = 2; i  < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}	
	}
}

<Console>
2*1=2	2*2=4	2*3=6	2*4=8	2*5=10	2*6=12	2*7=14	2*8=16	2*9=18	
3*1=3	3*2=6	3*3=9	3*4=12	3*5=15	3*6=18	3*7=21	3*8=24	3*9=27	
4*1=4	4*2=8	4*3=12	4*4=16	4*5=20	4*6=24	4*7=28	4*8=32	4*9=36	
5*1=5	5*2=10	5*3=15	5*4=20	5*5=25	5*6=30	5*7=35	5*8=40	5*9=45	
6*1=6	6*2=12	6*3=18	6*4=24	6*5=30	6*6=36	6*7=42	6*8=48	6*9=54	
7*1=7	7*2=14	7*3=21	7*4=28	7*5=35	7*6=42	7*7=49	7*8=56	7*9=63	
8*1=8	8*2=16	8*3=24	8*4=32	8*5=40	8*6=48	8*7=56	8*8=64	8*9=72	
9*1=9	9*2=18	9*3=27	9*4=36	9*5=45	9*6=54	9*7=63	9*8=72	9*9=81	

//ArrayRandom
import java.util.Random;

public class ArrayRandom {

	public static void main(String[] args) {
		Random r = new Random(100);
		
		int[] numbers = new int[1000];
		//numbers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,.....}
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(101);
			// 정수 +- 21 --> 0~100
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + ": " + numbers[i]);
		}
	}
}

<Console>
0: 92 ~ 999: 95

//ArrayMin
public class ArrayMin {

	public static void main(String[] args) {
		int[] s = { 90,80, 20, 60, 70};
		int min = s[0];

		for (int x : s) {
			if (x < min) min = x;
		} // for
		System.out.println("최소값은 " + min);
	} //main
}

<Console>
최소값은 20
