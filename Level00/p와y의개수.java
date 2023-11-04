package Level00;

import java.util.Map;
import algorithm.Util;

public class p와y의개수 {
	public static void main(String[] args) {
		
		String s = "pPopoyY";
		String s2 = s.toLowerCase();
		String[] s3 = s2.split("");
		
		Map<String, Integer> map = Util.countMap(s3);
		System.out.println(map);
		
		boolean answer = map.get("p") == map.get("y");
		System.out.println(answer);
	}
}