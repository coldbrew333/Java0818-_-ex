package Java_pr0818;

public class Ex7 {

	public Ex7() {// 생성자

		this.arr();// 생성자가 호출되면 호출되는 매서드(callBack 함수)
		this.twoArr();
	}

	private void arr() {// 생성자를 불러올 매서드
//		int[] result = {100, 100, 100,90,80,70,66,55,44};
//
//		100....................................... 합계

		int[] result = { 100, 100, 100, 90, 80, 70, 66, 55, 44 };

		int b = 0;

		for (int i = 0; i < result.length; i++) {

			b += result[i];
			System.out.print(result[i] + "\t ");
		}

		// System.out.println(Arrays.toString(result));

		System.out.println("합계 : " + b + "\t");

	}// arr

	private void twoArr() {
		int num[][] = { { 100, 100, 100 }, { 90, 80, 70 }, { 66, 55, 44 } };// 2차원배열 선언
		
		int c = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				
				c += num[i][j];
				
				System.out.print(num[i][j] + "\t");
			}
			System.out.println("합계 : " + c);
			
			c = 0;//합계 비워주기
			
		}

	}// main

}
