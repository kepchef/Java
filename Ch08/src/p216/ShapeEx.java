package p216;

abstract class Shape {
	
	public String type;
	void Shape(String type){
		this.type = type;
	}
	abstract double area();
	abstract double length();

}

class Circle extends Shape{
	int r;
	Circle(int r){
		super("¿ø");
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math .PI;
	}
	@Override
	double length() {
		return 2 * r * Math .PI;
	}
	@Override
	public String toString() {
		return "Shape [type=" + type + ", r="+ r +"]";
	}
}
class Rectangle extends ShapeEx{
	int width, height;
	private String type;
	Rectangle(int width, int height){
		super();
		this.width = width;
		this.height = height;
	}
	
	double area() {
		return width * height;
	}
	double length() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return "Shape [type =" +type+", width="+width+", height="+height+"]";
	}
	
}
public class ShapeEx{
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("³ÐÀÌ :" +s.area()+"µÑ·¹:"+s.length());
		}
	}
}