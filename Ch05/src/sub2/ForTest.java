package sub2;
/*
 * 날짜:2020/11/03
 * 이름:김은표
 * 내용:반복문 for 실습하기 교재 p90
 */

public class ForTest {
	public static void main(String[] args) {
		
		//for 기초
		for(int i=1; i<=3 ;i++) {//초기식; 조건식; 증감식
			
			System.out.println("Hello java!");
		}
		
		//1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지 합 : "+sum);		
		
		//1부터 10까지 짝수합
		int eSum =0;
		
		for(int k=1; k<=10; k++) {
			if(k % 2 == 0) {
				eSum += k;
			}
		}
		System.out.println("1부터 10까지 짝수합 : " +eSum);
		
		
		//for 중첩(이중 for)
		for(int a=1; a<=3; a++) {//3번 반복
			
			System.out.println("a: "+a);
			
			for(int b=1; b<=5; b++) {//5번 반복
			
				System.out.println("b: "+b);
			}
		}
		
		//구구단 출력
		for(int x=2; x<=9; x++) {
			
			System.out.println(x + "단");
			
			for(int y=1; y<=9; y++) {
				
				int z= x *y;
				//System.out.println(x + "x" + y + "=" + z );
				System.out.printf("%d x %d = %d \n", x, y, z);//java형식으로도 가능
			}
		}
		
		//별삼각형1 출력
		for(int start=1; start <=10; start++) {
			
			for(int end=1; end <= start; end++) {//1+2+3+~~+10 증감식으로
				
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		//실습
		for(int start=10; start >=1; start--) {
			
			for(int end=1; end <= start; end++) {
				
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		
		//별삼각령2 출력
		for(int a=1; a<=5; a++) {
			
			for(int b=1; b<=5-a; b++) {
				System.out.println("☆");
			}
				
			for(int c=1; c<=a; c++) {
				System.out.println("★");
			}
			System.out.println("\n");
		}
	}
}
