package p57;
/*
 * 날짜:2020/11/03
 * 이름:김은표
 * 내용:증감연산
 */
public class OpEx3 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		++a;
		b++;
		
		System.out.println(a);
		System.out.println(b);
	}
	{
		int a = 10;
		int b = ++a;
		
		System.out.println("전위연산 결과: "+b);
		
		int x = 10;
		int y = x++;
		System.out.println("후위연산결과 : " +y);
		System.out.println("x : " +x);

	}

}
