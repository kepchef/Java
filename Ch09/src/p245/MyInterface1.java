package p245;

public interface MyInterface1 {
	default void defaultMethod() {
		System.out.println("MyInerface1의 default 메서드");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드");
	}
}
