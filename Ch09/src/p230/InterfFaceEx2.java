package p230;

public interface InterfFaceEx2 {

	// ���
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;

	// �߻�޼���
	public abstract double meanPrice();

	public abstract double totalPrice();

	// default �޼���(������ �ۼ�)
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}

	// staric �޼���
	static void printPrice(double price) {
		System.out.println(price);
	}

}
