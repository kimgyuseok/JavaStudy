package codingtest;

import java.util.Arrays;
import java.util.Collections;

public class ex05 {
	public static void main(String args[]) {
//		자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//		예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		
//		n은 10,000,000,000이하인 자연수입니다.
		
		long n = 12345;
		
		solution(n);
	}

	private static int[] solution(long n) {
		String[] str = Long.toString(n).split("");
		int[] answer = new int[str.length];
		
		for(int i=0;i<str.length;i++){
			answer[i] = Integer.parseInt(str[(str.length-1)-i]);
			System.out.print(answer[i]+ "");
		}
		
		return answer; 
	}
	
	
}
