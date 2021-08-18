package Java_pr0818;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		

		//랜덤 숫자 맞추기
		
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[]a =  new int[3];

		String box = ""; 
		
		for(int k = 0 ; k < 100 ; k++) {
			
			int tmp = 0;
			
			int i =  (int)(Math.random() * num.length);
			int j =  (int)(Math.random() * num.length);
			
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}
		
		System.arraycopy(num, 0, a, 0, 3);
		
		for(int i = 0; i < a.length; i++) {
			
			box += a[i]; 
		}
		System.out.println(box);
		
		
		int b = Integer.parseInt(box);
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		
		do {
			System.out.println("세정수를 입력해주세요");
			
			input = scan.nextInt();
			
			
			
			if(input > b) {
				System.out.println("더 작은수를 입력해주세요>");
			}else if(input < b) {
				System.out.println("더큰수를 입력해주세요>");
			}else {
				System.out.println("정답입니다.");
			}
			
			
		}while(input != b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//public class Ex1
