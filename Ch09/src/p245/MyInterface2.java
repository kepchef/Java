package p245;

public interface MyInterface2 {
	default void defaultMethod() {
	}

	static void staticMethod() {
		System.out.println("My Interface2의 static 메서드");
	}
}
