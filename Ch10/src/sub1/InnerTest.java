
package sub1;
/*
 * ��¥:2020/11/16
 * �̸�:����ǥ
 * ����:��øŬ���� �ǽ��ϱ� ����p254
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
