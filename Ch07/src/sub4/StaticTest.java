package sub4;
/*
 * 날짜:2020/11/10
 * 이름: 김은표
 * 내용:정적변수(클래스벼수), 정적메서드(클래스메서드) 실습하기
 */
public class StaticTest {
	public static void main(String[] args) {
		
		Increment inc1 = new Increment();//1
		Increment inc2 = new Increment();//1+1=2
		/*
		  정적변수(클래스 변수), 정적메서드(클래스 메서드)는 이미 고정할당영역(method Area)에
		  생성되어 있기 때문에 객체 생성없이 바로 참조 할 수 있다.
		 */
		
		inc1.num1 = 1;		
		inc2.num2 = 2;		
		
		Increment.num2 += 3;//2+2=5
		Increment.add();//5+1=6
		
		Increment inc3 = new Increment();//6+1=7
		
		//싱글톤 객체 - 교재 p185
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(1, 2);
		int r3 = cal.multi(1, 2);
		int r4 = cal.div(1, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
