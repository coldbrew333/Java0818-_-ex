package Java_pr0818;

public class Ex4 {

	public static void main(String[] args) {
		
		int[][]snail = new int[5][5];
		
		int k = 1;//1~25
		
		int print = 5;//줄어들게 하기 위해서쓰임
		
		int right = -1;
		int bottom = 0;
		int top = 1;

		for(int i = 5 ; i > 0 ; i--) {
			for(int j = 0;  j < print ; j++) {
				right += top;
				snail[bottom][right] = k;
				
				k++;
			}
			print--;
			for(int j = 0 ; j < print ; j++) {
				bottom += top;
				snail[bottom][right] = k;
				k++;
			}
			top = top *(-1);
		}
		
		for(int i = 0 ; i < snail.length; i++) {
			for(int j = 0 ; j < snail[i].length; j++) {
			System.out.print(snail[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}//main

}//public class Ex4
