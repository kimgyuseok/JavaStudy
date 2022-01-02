package codingtest;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
//		자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//		예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 N입력:");
		int n = sc.nextInt();
		
		Solution(n);
		
	}
	
	public static int Solution(int n) {
		 int answer = 0;
	        String[] str = Integer.toString(n).split("");
	       
	        for(int i=0;i<str.length;i++){
	            answer += Integer.parseInt(str[i]);
	        }
	        System.out.print("합:"+answer);
	        
	        return answer;
	}

}
