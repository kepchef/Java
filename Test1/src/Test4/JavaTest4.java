package Test4;
/*
 * 날짜:2020/11/04
 * 이름:김은표
 * 내용:자바 연산자 연습문제
 */
public class JavaTest4 {
	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z = 0;
		
		z = x + y;
		System.out.println("x + y= " +z);
				
		z = x - y;
		System.out.println("x - y= " +z);
				
		z = x * y;
		System.out.println("x * y= " +z);
				
		z = x / y;
		System.out.println("x / y= " +z);
		
		z = (x + y) * (x - y);
		System.out.println("(x + y) * ( x- y)= " +z);
				
		z = (x * y) + (x / y);
		System.out.println("(x * y) + (x / y)= " +z);
	}

}
