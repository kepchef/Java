package p257;

public class A {//�ٰ� Ŭ����
	public A(){//�ٱ� Ŭ������ ������
	System.out.println("A��ü ����");
	}
	public static class B{//static ���� Ŭ����
		public B(){//static ���� Ŭ������ ������
			System.out.println("C��ü ����");
		}
		public int var1;
		public static int var2;
		
		public void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		public static void method2() {
			System.out.println("static ���� Ŭ������ static method2()");
		}
	}
	public class C{//�ν��Ͻ� ���� Ŭ����
		public C(){//�ν��Ͻ� ���� Ŭ������ ������
			System.out.println("B��ü ����");
		}
		public int var1;
		public void method() {
			System.out.println("�ν��Ͻ� ���� Ŭ������ method()");
		}
	}
	public void method() {//�ٱ� Ŭ������ �޼���
		class D{//���� ���� Ŭ����
			D(){
			System.out.println("D��ü ����");	
			}
			int var1;
			
			void method1() {
				System.out.println("��Į �׺� Ŭ������ method1()");
			}
		}
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
}
