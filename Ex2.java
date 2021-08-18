package Java_pr0818;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		

		//야구게임
		
		
		int[] baseArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int[] computer = new int[3];
		int[] user = new int[3];
		
		int cnt = 0;
		
		String box = "";
		String input = "";
		
		for(int k = 0; k < 100; k++) {
			int tmp = 0;
			
			int i = (int)(Math.random() * baseArr.length);
			int j = (int)(Math.random() * baseArr.length);
			
			tmp = baseArr[i];
			baseArr[i] = baseArr[j];
			baseArr[j] = tmp;
		}
		
		System.arraycopy(baseArr, 0, computer, 0, 3);
		
		for(int i = 0; i < computer.length; i++) {
			
			box += computer[i];
		}
		
		int a = Integer.parseInt(box);
		
		System.out.println(a);
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			int strike = 0;
			int ball = 0; 
			
			System.out.println("세정수를 입력해주세요");
			
		   input = scan.nextLine();
			
			
			user[0] = a /100;
			user[1] = (a%100)/10;
			user[2] = a%10;
			
			cnt++;
			
			for(int i = 0; i < computer.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(computer[i] == user[j]) {
						if(i == j) {
							strike++;
						}else {
							ball++;
						}//else
					}//if
				}//for
			}//for
			
			System.out.println("회"+" "+cnt+" "+user[0]+user[1]+user[2] +" "+"스트라이크"+strike+" "+"볼"+ball);
			
			
		}while(!box.equals(input));
		
		if(box.equals(input)) {
			System.out.println("축하합니다~ " + " "+user[0]+user[1]+user[2] +" 는 정답입니다");
		}
		
		
		
		
		
		
		
		
		
		
	}//main

}//public class Ex2
