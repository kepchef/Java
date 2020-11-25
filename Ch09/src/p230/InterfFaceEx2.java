package p230;

public interface InterfFaceEx2 {

	// 상수
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;

	// 추상메서드
	public abstract double meanPrice();

	public abstract double totalPrice();

	// default 메서드(구현부 작성)
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}

	// staric 메서드
	static void printPrice(double price) {
		System.out.println(price);
	}

}
