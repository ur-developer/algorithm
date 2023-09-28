
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

//Ex01
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