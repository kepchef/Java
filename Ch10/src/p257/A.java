package p257;

public class A {//바같 클래스
	public A(){//바깥 클래스의 생성자
	System.out.println("A객체 생성");
	}
	public static class B{//static 내부 클래스
		public B(){//static 내부 클래스의 생성자
			System.out.println("C객체 생성");
		}
		public int var1;
		public static int var2;
		
		public void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
		public static void method2() {
			System.out.println("static 내부 클래스의 static method2()");
		}
	}
	public class C{//인스턴스 내부 클래스
		public C(){//인스턴스 내부 클래스의 생성자
			System.out.println("B객체 생성");
		}
		public int var1;
		public void method() {
			System.out.println("인스턴스 내부 클래스의 method()");
		}
	}
	public void method() {//바깥 클래스의 메서드
		class D{//로컬 내부 클래스
			D(){
			System.out.println("D객체 생성");	
			}
			int var1;
			
			void method1() {
				System.out.println("러칼 네부 클래스의 method1()");
			}
		}
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
}
