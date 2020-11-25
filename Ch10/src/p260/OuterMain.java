package p260;

public class OuterMain {
	public static void main(String[] args) {

		Outer out = new Outer();

		out.setInterfaceEx(new InterfaceExImple1());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExImple2());
		out.outerMethod();
	}
}
