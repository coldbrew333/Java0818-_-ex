package Java_pr0818;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		int[][] result = {{1,2,3,4,5}, {16, 17, 18, 19, 6},{15, 24, 25, 20, 7 },{14, 23, 22, 21, 8},{13, 12, 11, 10, 9}};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		
		
		int a = scan.nextInt();
		
		if(a == 1) {
			System.out.println(result[0][0] +"\t " +result[0][1]  +"\t " + result[0][2]  +" \t" + result[0][3]  +"\t " + result[0][4] );
			
		}else if(a == 2) {
			System.out.println(result[0][0] +" \t" +result[0][1]  +" \t" + result[0][2]  +"\t " + result[0][3]  +" \t" + result[0][4] );
			System.out.println(result[1][0] +" \t" +result[1][1]  +" \t" + result[1][2]  +" \t" + result[1][3]  +"\t " + result[1][4]);
					
		}else if(a == 3) {
			System.out.println(result[0][0] +" \t" +result[0][1]  +" \t" + result[0][2]  +"\t " + result[0][3]  +" \t" + result[0][4] );
			System.out.println(result[1][0] +" \t" +result[1][1]  +" \t" + result[1][2]  +" \t" + result[1][3]  +"\t " + result[1][4]);
			System.out.println(result[2][0] +" \t" +result[2][1]  +"\t " + result[2][2]  +" \t" + result[2][3]  +"\t " + result[2][4]);		
		}else if(a == 4) {
			System.out.println(result[0][0] +" \t" +result[0][1]  +" \t" + result[0][2]  +"\t " + result[0][3]  +" \t" + result[0][4] );
			System.out.println(result[1][0] +" \t" +result[1][1]  +" \t" + result[1][2]  +" \t" + result[1][3]  +"\t " + result[1][4]);
			System.out.println(result[2][0] +" \t" +result[2][1]  +"\t " + result[2][2]  +" \t" + result[2][3]  +"\t " + result[2][4]);		
			System.out.println(result[3][0] +" \t" +result[3][1]  +"\t " + result[3][2]  +"\t " + result[3][3]  +"\t " + result[3][4]);	
		}			
				
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//public class Ex8
