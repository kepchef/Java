
package sub1;
/*
 * 날짜:2020/11/16
 * 이름:김은표
 * 내용:중첩클래스 실습하기 교재p254
 */

import sub1.Outer.Inner;

public class InnerTest {
	public static void main(String[] args) {

		Outer out = new Outer(100);
		out.show();

		Inner inn = out.new Inner(200);
		inn.show();

	}

}
