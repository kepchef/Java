package p184;

public class ClassA {
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.print();
	}
	public void print() {
		System.out.println("����� Class1");
	}
}
class ClassB{
	void print() {
		System.out.println("����� ClassB");
	}
}
