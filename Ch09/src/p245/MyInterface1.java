package p245;

public interface MyInterface1 {
	default void defaultMethod() {
		System.out.println("MyInerface1�� default �޼���");
	}
	static void staticMethod() {
		System.out.println("MyInterface2�� static �޼���");
	}
}