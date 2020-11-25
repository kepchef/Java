package p255;

public class LocallnnerEx {//바깥클라스
	int i = 10;
	
	void outermethod() {
		class Inner{//로컬 글래스
			int x=20;//메서드 지연변수
			int i=30;//메서드 지역변수
			void innerMethod() {
				 System.out.println(x);
				 System.out.println(i);//안쪽 클래스의 i변수
				 System.out.println(this.i);//안쪽 클래스의 i변수
				 System.out.println(LocallnnerEx.this.i);//바깥 클래스의 i변수
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
	public static void main(String[] args) {
		LocallnnerEx lic = new LocallnnerEx();
		lic.outermethod();
	}

}
