package codingtest;

import java.util.Arrays;
import java.util.Collections;

public class ex04 {
	public static void main(String[] args) {
		
	
		long n = 118372;
		
	
		System.out.println(solution(n));
	}

	private static long solution(long n) {
		long answer = 0;
		
		String temp = Long.toString(n);
        long[] lnumber = new long[temp.length()];
        Long[] Lnumber = new Long[temp.length()];

        for(int i=0;i<lnumber.length;i++) {
            lnumber[i] = temp.charAt(i)-'0';
            Lnumber[i] = lnumber[i]; 

        }
        Arrays.sort(Lnumber, Collections.reverseOrder());
        System.out.println(Arrays.toString(Lnumber));

        String num="";
        for(int i=0;i<Lnumber.length;i++) {
            num += Lnumber[i];
        }

        answer = Long.parseLong(num);


        return answer;
		
	}
	
	/*
	 * 다른 사람이 푼 문제이다.
	 * 이 소스코처럼 split를 썻다면 좀더 간단하게 풀수 있었을거 같다..
	private static long solution(long n) {
		String[] strN = Long.toString(n).split("");
		String temp = "";
		
		Arrays.sort(strN,Collections.reverseOrder());
		
		for(String s : strN) {
			temp += s;
		}
		
		answer = Long.parseLong(temp);
		
		return answer;
	}
	*/

}
