package sub6;
/*
 * 날짜:2020/11/11
 * 이름:김은표
 * 내용:주상클래스 실습하기 교재 p216
 */

public class AbstractClassTest {
	
	public static void main(String[] args) {
		
		//추상클래스는 직접 객체생설을 할 수 없다.
		//Unit u = new Unit();
		
		Unit u1 = new Marine();
		Unit u2 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
	}

}
