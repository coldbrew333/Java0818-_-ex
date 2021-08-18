package Java_pr0818;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		
		//for문으로 구구단
		Scanner scan = new Scanner(System.in);
		
		int a= 0;
		System.out.println("숫자를 입력해주세요");
		
		a = scan.nextInt();
		
		for(int i = 2 ; i <= 9 ; i++) {
			for(int j  = 1 ; j <= a ; j++) {
				 System.out.println(i + "x"+ j + "= "+ (i*j));
			}
			System.out.println();
		}
	
		
		
		
		
		
	}//main

}//public class Ex5
