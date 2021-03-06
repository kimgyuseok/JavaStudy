package codingtest;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
//		문제 설명
//		정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//		제한 조건
//		arr은 길이 1 이상인 배열입니다.
//		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
		
//		ex) [4,3,2,1] ->	[4,3,2]
//		      [10]	  ->	[-1]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이를 지정해주세요:");
		int index = sc.nextInt();
		int[] arr = new int[index];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"번째 숫자를 입력해주세요:");
			int number=sc.nextInt();	
			arr[i] = number;
		}
		System.out.println();

		for(int i=0;i<solution(arr).length;i++) {
			System.out.print(solution(arr)[i]+" ");
		}
		
		
	}
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		int min = arr[0];
		
		if(arr.length <=1) {
			int[] answer1 = {-1};
			return answer1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {  // 비교하여 가장 작은값을 가져온다.
				min = arr[i]; 
			}
		}
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(min == arr[i]){
                continue;
            }else{
                answer[index++]=arr[i];
            }
		}
		return answer;
	}
	
}
