package Test8;
/*
 * 날짜:2020/11/04
 * 이름:김은표
 * 내용:자바 피라미드 연습문제
 */
public class JavaTest8{
	public static void main(String[] args) {

		int n = 5;
		
		for(int i=0; i<n; i++) {
			
			for(int j=1; j < n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
			}
		}
}
