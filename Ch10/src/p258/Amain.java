package p258;

import p257.A;

public class Amain {
	public static void main(String[] args) {
		A a = new A();
		//static ��� Ŭ���� ��ü ����
		A.B b = new A.B();
		b.var1 = 3;
		b.method1();
		A.B.var2 =3;
		A.B.method2();
		//�ν����� ���� Ŭ���� ��ü ����
		A.C c = a.new C ();
		c.var1 = 3;
		c.method();
		
		//���� �۷��� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}

}
