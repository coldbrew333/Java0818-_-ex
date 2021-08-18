package Java_pr0818;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public Ex3() {//생성자
		this.showView();
	}
	
	
	
	private void showView() {//생성자를 불러올 매서드
		int ran = 0;//computer
		
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;//user
		 ran = (int)(Math.random()*101);
		
		System.out.println(ran);
		 
		 do {
			 System.out.println("1~100까지의 수를 입력해주세요");
			 
			  input = scan.nextInt();
			 
			  if(input > 100) {
				  System.out.println("프로그램이 종료 되었습니다");
				  return;
			  }
			  
			  
			  if(input > ran) {
				  System.out.println("더 작은수를 입력해주세요");
			  }else if(input < ran) {
				  System.out.println("더 큰수를 입력해주세요");
			  }
			  
		 }while(input != ran);
		 
		 if(input == ran) {
			 System.out.println("정답입니다~");
		 }

	}
	
	
	
	

}//public class Ex3
