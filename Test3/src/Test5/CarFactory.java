package Test5;

public class CarFactory{
	private static CarFactory instance = new CarFactory();
	private CarFactory(){}//접근권한
	
	public static CarFactory getInstance() {
		return instance;
	}
	public Car createCar(String name, int price) {
		return new Car(name, price);
	}
}
